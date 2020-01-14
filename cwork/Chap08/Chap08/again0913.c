#include <stdio.h>

int main_again0913(void)
{
	int i, f0, f1, n;
	f0 = 0;
	f1 = 1;

	scanf("%d", &n);

	for (i = 1; i <= n; i++)
	{
		int tmp = f0 + f1;
		printf("%d, ", f0);
		f0 = f1;
		f1 = tmp;
	}
	return 0;
}
