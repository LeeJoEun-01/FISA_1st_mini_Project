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

## ✍️ 데이터 수집 과정

친구들의 정보를 스프레드시트를 활용해 **직접 입력 받았습니다.**  
아래 시트에 이름, 나이, MBTI, 관심사, 싫어하는 것, 최애 음식 등을 수집했습니다.

[📄 데이터 시트 보기](https://docs.google.com/spreadsheets/d/1tjXSgcjEWC5aopsZVmhqXQZPdYASuom2a5eMwUNoSBs/edit?usp=sharing)

---

## 🏗️ MVC 패턴 선택 이유 및 디렉토리 구조

프로젝트의 **구조적 유지보수와 역할 분리**를 위해 MVC 패턴을 채택했습니다.

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

## 🗂️ 담당자 및 역할

| 팀원  | GitHub                                                   | 담당 기능              | 프로필 사진                                                    |
|:---:|:--------------------------------------------------------:|:------------------:|:---------------------------------------------------------:|
| 이제현 | [github.com/lyjh98](https://github.com/lyjh98)           | 오늘의 친구 추천          | <img src="https://github.com/lyjh98.png" width="80">      |
| 임유진 | [github.com/imewuzin](https://github.com/imewuzin)       | 이름 궁합 보기, 최애 음식 매칭 | <img src="https://github.com/imewuzin.png" width="80">    |
| 이정이 | [github.com/2jeong2](https://github.com/2jeong2)         | MBTI로 친구 찾기        | <img src="https://github.com/2jeong2.png" width="80">     |
| 이조은 | [github.com/LeeJoEun-01](https://github.com/LeeJoEun-01) | 나의 스터디 매칭          | <img src="https://github.com/LeeJoEun-01.png" width="80"> |

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

## 🌱 규칙 및 협업 가이드

- Git은 **반드시 Git Bash에서만 작업**합니다.
- 이슈 및 커밋 메시지 컨벤션을 팀 내에서 통일합니다.
- 코드 리뷰를 통해 개선 사항을 적극 공유합니다.

---

## 📝 기여

프로젝트에 기여하실 분들은 자유롭게 **이슈와 PR**을 남겨주세요.

👯 **함께 친해지길 바라~!**

---

## 📝 회고- 관심 스터디 주제를 기반으로 추천 친구를 보여줍니다.

---

### 5. 최애 음식 매칭

- 특정 음식을 좋아하는 친구를 찾을 수 있습니다.

---

## 🗂️ 담당자 및 역할

| 팀원  | GitHub                                                   | 담당 기능              | 프로필 사진                                                    |
|:---:|:--------------------------------------------------------:|:------------------:|:---------------------------------------------------------:|
| 이제현 | [github.com/lyjh98](https://github.com/lyjh98)           | 오늘의 친구 추천          | <img src="https://github.com/lyjh98.png" width="80">      |
| 임유진 | [github.com/imewuzin](https://github.com/imewuzin)       | 이름 궁합 보기, 최애 음식 매칭 | <img src="https://github.com/imewuzin.png" width="80">    |
| 이정이 | [github.com/2jeong2](https://github.com/2jeong2)         | MBTI로 친구 찾기        | <img src="https://github.com/2jeong2.png" width="80">     |
| 이조은 | [github.com/LeeJoEun-01](https://github.com/LeeJoEun-01) | 나의 스터디 매칭          | <img src="https://github.com/LeeJoEun-01.png" width="80"> |

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
║    오늘은 어떤 친은
