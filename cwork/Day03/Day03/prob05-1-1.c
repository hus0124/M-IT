#include <stdio.h>

int main_05_1_1(void)
{
	int x1, y1;		//ÁÂ»ó´Ü ÁÂÇ¥
	int x2, y2;		//¿ìÇÏ´Ü ÁÂÇ¥

	printf("ÁÂ»ó´Ü ÁÂÇ¥°ªÀ» ÀÔ·ÂÇÏ¼¼¿ä : ");
	scanf("%d %d", &x1, &y1);

	printf("¿ìÇÏ´Ü ÁÂÇ¥°ªÀ» ÀÔ·ÂÇÏ¼¼¿ä : ");
	scanf("%d %d", &x2, &y2);

	int width = x2 - x1;
	int height = y2 - y1;
	
	printf("³ÐÀÌ = %d\n", width * height);

	return 0;

}