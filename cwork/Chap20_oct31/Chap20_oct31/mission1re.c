void printArray(int num[][4])		//int num[][4]
{								// arr[i] = *(ptr + i) 같은 표현
	for (int i = 0; i < 4; i++)
	{
		for (int j = 0; j < 4; j++)
		{
			printf("%3d", num[i][j]);
		}
		printf("\n");
	}
	printf("\n");
}

void rotateArray(int num[][4])	// 배열 num을 90도 회전하는 함수
{
	int rot[4][4];

	for (int i = 0; i < 4; i++) {			//회전시킨 데이터를 배열에 저장
		for (int j = 0; j < 4; j++) {
			rot[j][3 - i] = num[i][j];
		}
	}

	for (int i = 0; i < 4; i++) {		// 배열에 저장된 회전시킨 데이터를 원래 배열에 갔다놓기.
		for (int j = 0; j < 4; j++) {
			num[i][j] = rot[i][j];
		}
	}
}

int main_miss1re(void)

{
	// int arr[4][4] = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16} };

	int arr[4][4];
	int num = 1;
	for (int i = 0; i < 4; i++)
	{
		for (int j = 0; j < 4; j++)
		{
			arr[i][j] = num++;
		}
	}

	// 90도 배열을 회전
	for (int i = 0; i < 4; i++) {
		printArray(arr);	// 배열 출력
		rotateArray(arr);	// 90도 회전
	}

	return 0;
}