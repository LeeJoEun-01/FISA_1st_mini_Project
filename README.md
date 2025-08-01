# 👯 친해지길 바라 ~ 미니 프로젝트

반 친구들과 더 친해지기 위한 Java 콘솔 애플리케이션입니다.  
사전에 입력된 친구들의 다양한 정보를 기반으로, 여러 기능을 통해 서로를 더 잘 알아갈 수 있습니다.

---

## 🎯 프로젝트 기획 배경

친해지길 바라 프로젝트는 **우리 반 친구들끼리 더 친숙해지고, 서로에 대해 알아가며 협력할 수 있도록** 기획되었습니다.

단순한 정보 조회에 그치지 않고,  

- 이름과 성향을 기반으로 한 궁합 보기  
- MBTI 매칭  
- 스터디 및 취향 기반 추천  

등 재미 요소를 결합했습니다.

---
## 🗂️ 담당자 및 역할

| 팀원  | GitHub                                                   | 담당 기능              | 프로필 사진                                                    |
|:---:|:--------------------------------------------------------:|:------------------:|:---------------------------------------------------------:|
| 이제현 | [github.com/lyjh98](https://github.com/lyjh98)           | 오늘의 친구 추천          | <img src="https://github.com/lyjh98.png" width="80">      |
| 임유진 | [github.com/imewuzin](https://github.com/imewuzin)       | 이름 궁합 보기, 최애 음식 매칭 | <img src="https://github.com/imewuzin.png" width="80">    |
| 이정이 | [github.com/2jeong2](https://github.com/2jeong2)         | MBTI로 친구 찾기        | <img src="https://github.com/2jeong2.png" width="80">     |
| 이조은 | [github.com/LeeJoEun-01](https://github.com/LeeJoEun-01) | 나의 스터디 매칭          | <img src="https://github.com/LeeJoEun-01.png" width="80"> |

---

## ✍️ 데이터 수집 과정

친구들의 정보를 스프레드시트를 활용해 **직접 입력 받았습니다.**  
아래 시트에 이름, 나이, MBTI, 관심사, 싫어하는 것, 최애 음식 등을 수집했습니다.

[📄 데이터 시트 보기](https://docs.google.com/spreadsheets/d/1tjXSgcjEWC5aopsZVmhqXQZPdYASuom2a5eMwUNoSBs/edit?usp=sharing)

---

## 🏗️ MVC 패턴 선택 이유 및 디렉토리 구조

프로젝트의 **구조적 유지보수와 역할 분리**를 위해 MVC 패턴을 채택했습니다.
![image](https://github.com/user-attachments/assets/80552def-1b8b-4825-9e82-af0dfabb99a5)


- **Model:** 데이터와 로직
  - `Person`: 이름, 나이
  - `Student`: MBTI, 취향/성향 배열
- **View:** 화면 표시 및 입력
- **Controller:** 사용자 입력 처리, Model과 View 연결

**디렉토리 예시**

```
src/
├── controller/
│   ├── MainController.java
│   ├── MatchController.java
│   ├── RecommandController.java
│   ├── MbtiController.java
│   └── StudyController.java
├── model/
│   ├── Person.java
│   ├── Student.java
│   └── Databases.java
└── view/
    ├── StartView.java
    ├── MenuView.java
    ├── SuccessView.java
    └── FailView.java

```

---

## ✨ 주요 기능

### 1. 오늘의 친구 추천

랜덤으로 친구 한 명을 추천하여 프로필을 보여줍니다.

---

### 2. 이름 궁합 보기

- 현재 사용자와 친구의 이름/취향을 기반으로 궁합 점수를 계산합니다.
- 재미 요소를 위해 랜덤 점수를 가중치로 반영합니다.

---

### 3. MBTI로 친구 찾기

- 원하는 MBTI를 입력하면 해당 MBTI를 가진 친구 목록을 출력합니다.

---

### 4. 나의 스터디 매칭

- 관심 스터디 주제를 기반으로 추천 친구를 보여줍니다.

---

### 5. 최애 음식 매칭

- 특정 음식을 좋아하는 친구를 찾을 수 있습니다.

---

## 🌱 학습 목표

✅ Git으로 협업 연습 및 코드 리뷰  
✅ Java OOP 복습 및 예외 처리  
✅ Lombok 애노테이션 (@Getter, @Setter 등)  
✅ MVC 설계 패턴의 실전 적용  
✅ 자바 콘솔 기반 사용자 인터페이스 제작

---

## 💻 개발 환경

- Java 17+
- Git Bash
- GitHub 협업
- Lombok

---

## 🌟 사용 예시

```
╔════════════════════════════════════════════╗
║           👯 친해지길 바라 👯             ║
║                                            ║
║   반 친구들과 더 가까워지고 싶나요?        ║
║    오늘은 어떤 친구와 이야기 나눠볼까요?  ║
║                                            ║
║            ⌜ by 친해지길 바라팀 ⌟          ║
╚════════════════════════════════════════════╝

시작하려면 엔터를 눌러주세요!

...

메뉴 번호를 선택해주세요 (1\~6):
```

---
# JDBC 적용
이번 프로젝트는 기존에 자바 내부에서 직접 객체(Student) 배열을 생성해 사용하던 방식을 벗어나, Oracle 데이터베이스를 활용한 외부 데이터 관리 및 JDBC 연동 실습을 목표로 합니다.

## 기존 구조와 새로 적용한 구조
<img width="700" alt="image" src="https://github.com/user-attachments/assets/f2690ab3-6b25-4aca-810a-d14359630317" />

### ✅ 클래스 역할
- `DBUtil.java`<br>
  : **Oracle DB와의 연결(Connection) 및 자원 해제(close) 기능을 담당하는 데이터베이스 유틸리티 클래스**입니다.<br>
  dbinfo.properties에서 DB 접속 정보를 읽어 JDBC 연결을 초기화하며, 연결/해제 처리를 간편하게 도와줍니다.

- `StudentDAO.java`<br>
  : student 테이블과 관련된 조회, 검색, 매칭, 호환도 계산 등의 로직을 수행하는 **데이터 액세스 객체(DAO)**입니다.<br>
  현재 사용자 관리, 이름 기반 조회, 조건 검색 등 다양한 DB 연동 기능을 포함합니다.

---

### 🕹️ 데이터 삽입, 수정, 삭제 메뉴 추가

| 학생 추가 | 학생 정보 수정 | 학생 삭제 |
| ---- | ---- | ----|
|<img width="382" alt="image" src="https://github.com/user-attachments/assets/64d6fc2e-9444-407d-b2de-e2d0d0c9f0fd" /> | <img width="382" alt="image" src="https://github.com/user-attachments/assets/98b1afa6-04cd-4995-a5c5-4bd22f530bbc" /> | <img width="382" alt="image" src="https://github.com/user-attachments/assets/032c542a-ce02-47e0-ae10-3925f8c1b34a" /> |


### 🔗 Oracle DB와 연동해서 사용하는 이점
- 실제 DB 기반 데이터 관리로 객체 배열보다 확장성과 유지보수성이 뛰어남
- SQL을 활용한 조건별 검색/필터링/집계 가능 → 메모리 연산보다 성능 및 유연성 우수
- JDBC 기반으로 데이터를 동적으로 로딩/저장할 수 있어 데이터 변경에도 유연하게 대응 가능

---

## 🌱 규칙 및 협업 가이드

- Git은 **반드시 Git Bash에서만 작업**합니다.
- 이슈 및 커밋 메시지 컨벤션을 팀 내에서 통일합니다.
- 코드 리뷰를 통해 개선 사항을 적극 공유합니다.

## 📝 기여

프로젝트에 기여하실 분들은 자유롭게 **이슈와 PR**을 남겨주세요.

## 📓 회고
- 이제현
  - 평소 Gitbash에 대한 이해도가 낮고, 많이 활용하지 못했습니다. 좋은 기회로 실력있는 팀원들과 함께 프로젝트를 경험해 볼 수 있었고, Gitbash의 기본적이고 필수적인 사용요소에 대해 알게 되었습니다. 또한 패턴 흐름에 대해 이해도가 높아져 클래스별 코드를 작성하고 자바를 통한 프로젝트 구상에 구조적인 부분을 다져가는 계기가 되었습니다. 
- 임유진
  - 자바로는 처음 하는 프로젝트여서 새로웠다. 비록 일주일이지만 배운 것을 최대한 활용하기 위해 상속, MVC 패턴 등 초반에 많이 결정하고 하니 5시간만에 완성한 프로젝트여도 완성도가 꽤나 높다는 평을 들었다. 확실히 프로젝트는 초반 기획과 개발 환경 세팅이 중요한 것 같다.
- 이정이
  - MVC 패턴에서 View와 Controller의 역할과 예외처리 방식에 대한 이해도가 낮아, 코드 구성과 각 클래스의 역할에 맞춰 코드를 구성해나가는 것에 어려움이 있었지만, 팀원들과 완성한 프로그램을 다시 보며 구조적인 부분을 이해하게 되었습니다. 그리고 Git Bash로 협업하는 방법을 알게되었습니다.  
- 이조은
  - 오랜만에 Git Bash로 협업하며 Git 명령어를 더 정확히 이해할 수 있었습니다. 또한 MVC 패턴을 작은 구조로 직접 만들어보며 Model, View, Controller의 역할과 데이터 흐름을 명확히 파악할 수 있었습니다.
이번 과정을 통해 단순한 기능 구현을 넘어서, 구조적인 사고와 협업을 고려한 코드 작성의 중요성을 다시 느낄 수 있어 좋았습니다.
