package model;

public class Databases {
	private static Student[] students;

	static {
		// 학생들 DB
		students = new Student[] {
				new Student("😍강사님😍", 21, "INFP", new String[] { "벌레" }, new String[] { "로코 드라마", "전자기기", "집" },
						new String[] { "인문학", "명리학" }, new String[] { "명리학", "타로", "철학", "심리학" },
						new String[] { "고기", "떡볶이", "국밥", "샤브샤브" }),

				new Student("이조은", 25, "ISFJ", new String[] { "벌레" }, new String[] { "동물", "돈" },
						new String[] { "오브젝트" }, new String[] { "금융권", "서비스" }, new String[] { "떡볶이", "초코", "포케" }),

				new Student("이제현", 28, "INFJ", new String[] { "무례함", "좀비", "여름", "너무 달달한 먹거리", "모기" },
						new String[] { "돈", "잠", "여행", "옷" }, new String[] { "알고리즘" }, new String[] { "금융권" },
						new String[] { "라멘", "파스타", "국밥" }),

				new Student("이정이", 25, "INFJ", new String[] { "여름", "벌레" },
						new String[] { "캠핑", "여행", "돈", "게임", "산책" }, new String[] { "알고리즘", "복습" },
						new String[] { "금융권" }, new String[] { "샌드위치", "초밥", "라멘", "떡볶이" }),

				new Student("임유진", 27, "ISTJ", new String[] { "벌레", "자연", "무서운 것", "등산", "고수", "민트초코" },
						new String[] { "집", "침대", "돈", "잠", "여행", "동물", "아재개그" }, new String[] { "CS" },
						new String[] { "금융권", "공기업" }, new String[] { "초콜릿", "포케", "파스타" }),

				new Student("임채준", 27, "ISTJ", new String[] { "없음" }, new String[] { "돈", "잠", "여행", "운동", "술", "게임" },
						new String[] { "클라우드", "인프라" }, new String[] { "대기업", "금융권" },
						new String[] { "고기", "회", "치킨" }),

				new Student("최홍석", 26, "INFJ", new String[] { "여름" }, new String[] { "마라" }, new String[] { "클라우드" },
						new String[] { "금융권", "SI" }, new String[] { "마라" }),

				new Student("고태우", 25, "INFJ", new String[] { "벌레" }, new String[] { "주식" }, new String[] { "알고리즘" },
						new String[] { "금융권" }, new String[] { "햄버거", "사브사브" }),

				new Student("이노운", 28, "ENTP", new String[] { "여름", "습한 날씨", "피로", "질병" },
						new String[] { "운동", "클래식감상" }, new String[] { "알고리즘", "NCS" }, new String[] { "금융권", "공기업" },
						new String[] { "부대찌개", "초밥", "라멘", "떡볶이", "고기" }),

				new Student("이기현", 27, "ISTJ", new String[] { "비" }, new String[] { "운동", "잠" }, new String[] { "CS" },
						new String[] { "금융권" }, new String[] { "회" }),

				new Student("강한솔", 31, "ESFP", new String[] { "습한 날씨", "벌레" }, new String[] { "동물", "잠", "맛있는거" },
						new String[] { "NCS", "알고리즘" }, new String[] { "금융권", "공기업" },
						new String[] { "초밥", "날 것", "해산물" }),

				new Student("김현수", 28, "ESTJ", new String[] { "벌레", "여름", "겨울" }, new String[] { "스포츠관람", "운동" },
						new String[] { "클라우드", "인프라" }, new String[] { "금융권", "중견", "대기업" },
						new String[] { "고기", "회" }),

				new Student("박지원", 28, "ISFJ", new String[] { "여름" }, new String[] { "돈", "여행", "운동" },
						new String[] { "알고리즘" }, new String[] { "금융권", "공기업" }, new String[] { "고기", "라멘" }),

				new Student("서민지", 25, "ESFJ", new String[] { "벌레", "습한 날씨", "여름" }, new String[] { "잠", "간식" },
						new String[] { "알고리즘" }, new String[] { "금융권", "공기업" }, new String[] { "고기", "디저트" }),

				new Student("문민경", 24, "ISFP", new String[] { "벌레", "비" }, new String[] { "동물", "게임", "집" },
						new String[] { "알고리즘" }, new String[] { "금융권", "IT기업" }, new String[] { "떡볶이", "스시" }),

				new Student("정서현", 25, "ISTJ", new String[] { "습한 날씨", "더러운 거" }, new String[] { "영화", "고기", "잠", "돈" },
						new String[] { "개발서적" }, new String[] { "금융권", "서비스" }, new String[] { "샤브샤브", "떡볶이", "초밥" }),

				new Student("장송하", 22, "ESFP", new String[] { "벌레", "비" }, new String[] { "고양이", "여행" },
						new String[] { "NCS", "알고리즘" }, new String[] { "중견기업", "공기업" }, new String[] { "떡볶이", "라멘" }),

				new Student("김동민", 25, "ENFJ", new String[] { "습한 날씨" }, new String[] { "집", "사진" },
						new String[] { "알고리즘" }, new String[] { "금융권" }, new String[] { "고기", "라멘" }),

				new Student("이영주", 24, "INTP", new String[] { "일찍 일어나기" },
						new String[] { "새", "집", "침대", "잠", "노래", "영화", "맛있는거 먹기" }, new String[] { "알고리즘" },
						new String[] { "금융권" }, new String[] { "고기", "초밥" }),

				new Student("전수민", 26, "INTP", new String[] { "벌레" }, new String[] { "집", "휴식" },
						new String[] { "알고리즘", "자바" }, new String[] { "금융권", "서비스" },
						new String[] { "샤브샤브", "규카츠", "디저트" }),

				new Student("신준수", 26, "ENFP", new String[] {}, new String[] { "운동", "춤" },
						new String[] { "알고리즘", "SQL", "네트워크" }, new String[] { "서비스" }, new String[] { "고기" }),

				new Student("박여명", 26, "ISTJ", new String[] { "벌레" }, new String[] { "잠", "집" },
						new String[] { "알고리즘" }, new String[] { "IT기업" }, new String[] { "고기" }),

				new Student("이용훈", 26, "ISTP", new String[] { "더위" }, new String[] { "게임", "운동" },
						new String[] { "알고리즘", "CS", "금융지식" }, new String[] { "금융권", "대기업" },
						new String[] { "회", "초밥", "옥수수", "고기" }),

				new Student("황지환", 26, "INTP", new String[] { "아침" }, new String[] { "저녁" },
						new String[] { "CS", "자격증" }, new String[] { "IT기업" }, new String[] { "햄버거", "치킨" }),

				new Student("정다빈", 24, "ENFJ", new String[] { "벌레", "여름", "겨울" },
						new String[] { "집", "강아지", "여행", "OTT", "드라이브" }, new String[] { "알고리즘" },
						new String[] { "금융권", "IT기업" }, new String[] { "떡볶이", "고기", "회" }),

				new Student("홍윤기", 26, "ISTJ", new String[] { "습한 날씨", "벌레", "여름" },
						new String[] { "게임", "돈", "부동산", "고양이" }, new String[] { "알고리즘" },
						new String[] { "금융권", "서비스" }, new String[] {}),

				new Student("김문석", 25, "ESFJ", new String[] {}, new String[] { "집" },
						new String[] { "클라우드", "알고리즘", "보안" }, new String[] { "금융권", "공기업" },
						new String[] { "마라탕", "고기", "햄버거" }),

				new Student("홍혜원", 25, "INTJ", new String[] { "벌레" }, new String[] { "집", "만화" },
						new String[] { "알고리즘" }, new String[] { "금융권" }, new String[] { "떡볶이" }),

				new Student("최소영", 25, "ENTP", new String[] { "습한 날씨", "출퇴근길 지하철" },
						new String[] { "강아지", "잠", "노래부르기", "여행가기", "게임", "방탈출", "영화", "맛있는 거 먹기", "5시 50분" },
						new String[] { "알고리즘", "취업 스터디" }, new String[] { "금융권", "IT기업" },
						new String[] { "라면", "초밥", "한식", "빙수", "해물", "양꼬치" }),

				new Student("황병길", 25, "INTP", new String[] { "습한 날씨", "악취", "피로" },
						new String[] { "축구", "귀여운거", "잠", "게임" }, new String[] { "알고리즘", "CS" },
						new String[] { "금융권", "IT기업" }, new String[] { "햄버거", "연어", "고등어", "떡볶이" }),

				new Student("신기범", 26, "ISTP", new String[] { "여름" }, new String[] { "게임", "잠" },
						new String[] { "알고리즘", "CS" }, new String[] { "IT기업" }, new String[] { "치킨", "햄버거", "마라탕" }) };
	}

	Student[] getStudents() {
		return students;
	}
}
