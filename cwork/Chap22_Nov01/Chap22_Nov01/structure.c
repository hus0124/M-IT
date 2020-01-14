/*
구조체
여러개 데이터를 묶은 것
*/

#include <stdio.h>
//구조체 정의를 앞 부분에서 선언 : 사용자 정의 데이터 타입
struct point	// 좌표값 저장 구조체
{
	int xpos;	// x 좌표
	int ypos;   // y 좌표
};

struct person
{
	char name[20];		//한글은 1자 3byte 
	char phoneNum[20];  //전화번호 010 처럼 0이 앞에 있으면 int 로 저장 안되니 char 로 한다.
	int age;
	char ssn[15];

};

int main_struc(void)
{		//선의 좌표를 읽는다
	struct point left;		// 데이터 타입 : struct point, 변수이름 : left
	struct point right;

	printf("좌표값 입력하세요(x, y) : ");
	scanf("%d %d", &left.xpos, &left.ypos);	//변수이름.멤버이름

	printf("좌표값 입력하세요(x, y) : ");
	scanf("%d %d", &right.xpos, &right.ypos);

	printf("left 좌표값 : (%d, %d)\n", left.xpos, left.ypos);
	printf("right 좌표값 : (%d, %d)\n", right.xpos, right.ypos);

	//홍길동 정보 입력
	struct person hong; // 데이터타입, 변수이름
	printf("이름 : ");
	scanf("%s", hong.name);

	printf("전화번호 : ");
	scanf("%s", hong.phoneNum);

	printf("나이: ");
	scanf("%d", &hong.age);		//문자열은 scanf에 & 필요 없으나 int 형은 주소표시 필요

	printf("주민번호 : ");
	scanf("%s", hong.ssn);

	printf("\n\n");
	printf("이름 : %s\n", hong.name);
	printf("전화번호 : %s\n", hong.phoneNum);
	printf("나이 : %d\n", hong.age);
	printf("주민번호 : %s\n", hong.ssn);

	return 0;
}