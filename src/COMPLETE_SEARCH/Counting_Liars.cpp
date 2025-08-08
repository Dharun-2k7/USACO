#include <bits/stdc++.h>
using namespace std;
int main() {
	int n;
	cin >> n;
	vector<pair<int, char>> cows(n);
	for (int i = 0; i < n; i++) {
		cin >> cows[i].second >> cows[i].first;
	}
	sort(cows.begin(), cows.end());
	vector<int> left(n);
	for (int i = 1; i < n; i++) {
		left[i] += left[i - 1];

		if (cows[i - 1].second == 'L') {
			left[i]++;
		}
	}
	vector<int>right(n);
	for (int i = n - 2; i >= 0; i--) {
        right[i] += right[i + 1];
		if (cows[i + 1].second == 'G') {
                right[i]++;
        }
	}

	int liars = n;
	for (int i = 0; i < n; i++) {
		liars = min(liars,left[i]+right[i]);
	}
	cout << min_liars << endl;
}
