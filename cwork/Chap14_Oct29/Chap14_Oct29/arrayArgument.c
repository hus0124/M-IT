/*
함수의 매개변수로 배열을 전달하는 방법
*/

#include	<stdio.h>

int add(int num1, int num2) {
	return num1 + num2;
}

// 문자열 배열 : '\0'가 배열에 포함되므로 문자열의 길이를 알수 있고, 따라서 길이는 전달 안함
// 배열 : 배열의 크기
int array_add(int narr[], int len) {		// arr[i] : *(ptr + i) 문법(약속)
//int array_add(int* narr) {	// arr[i] : *(ptr + i)
	int total = 0;
	for (int i = 0; i < len; i++) {
		total += narr[i];
	}
	return total;
}

// 함수의 매개변수로 배열을 전달할 때
// 매개변수로 주소와 배열의 크기를 전달

int main_arrayArgument(void) {
	int a = 10;
	int b = 20;

	int sum = add(a, b);	// 값 : 변수 자체
	printf("합: %d\n", sum);

	int arr[2] = { 30, 40 };
	int arr2[5] = { 10, 20, 30, 40, 50 };
	sum = array_add(arr2, 5);
	printf("합: %d\n", sum);
	sum = array_add(arr, 2);	// 배열의 데이터를 모두 더해서 반환 : 매개변수로 arr (배열의 주소)
	printf("합: %d\n", sum);

	return 0;
}