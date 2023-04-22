<div align="center">
    <h1> <img src="https://img.icons8.com/color/48/null/code.png" width="30" height="30" style="padding: 0;margin-bottom:-5px;" /> 알고리즘까지 브론즈가 될 순 없어 </h1>
</div>

<div align="center">
<a href="https://hits.seeyoufarm.com"><img src="https://hits.seeyoufarm.com/api/count/incr/badge.svg?url=https%3A%2F%2Fgithub.com%2Falgorithm-cote-study%2Fbaekjoon-algorithm&count_bg=%23A9A7E3&title_bg=%23555555&icon=yarn.svg&icon_color=%23E7E7E7&title=hits&edge_flat=false"/></a>
</div>

❈ 백준을 꾸준하게 풀어보며 플래티넘 이상을 도전하기 위해 만들어봤습니다. ❈

❗️ 규칙 ❗️

일주일에 2문제 이상 푸는 것을 목표로 하며 각자 목표한 티어까지 멈추지 않고 도전하는 것을 목표로 시작됩니다. </br>
문제 풀이 완료 후, PR 날리면 다음 월요일에 Merge

## <img src="https://img.icons8.com/color/48/null/folder-tree.png" width="30" height="30" style="padding: 0;margin-bottom:-5px;"/> 패키지 생성 기준

1. 패키지는 solved.ac의 class 분류대로 폴더를 생성했습니다. [바로가기](https://solved.ac/en/class) </br>
2. class 별로 각자 이름 패키지 생성

```
.
└── java
    ├── class1  <- class1
    │   └── seunggu
    ├── class1p <- class1+
    │   └── seunggu
    ├── class1pp <- class1++
    │   └── seunggu
    ├── class2
    │   └── seunggu
```

## <img src="https://img.icons8.com/color/48/null/java-files.png" width="30" height="30" style="padding: 0;margin-bottom:-5px;"/> 파일 생성 기준

파일은 Main + 문제번호로 생성해주세요. ex) Main1000.java

## <img src="https://img.icons8.com/color/48/null/programming-flag.png" width="30" height="30" style="padding: 0;margin-bottom:-5px;"/> 테스트코드 작성법

1. test/resource/testcase 폴더에 문제 번호 별로 폴더 생성
2. 문제의 테스트 케이스 갯수 만큼 test_caseN.txt 파일 생성 (반례도 넣어도 됨) (ex. test_case1.txt, test_case2.txt,
   test_case3.txt ...)
3. 패키지 단위의 Test class 생성
    - 내가 만든 class 에서 cmd + shift + N 단축키 입력시 new Test..입력하면 자동으로 test class 생성
4. 테스트 코드 작성

```java

// 테스트케이스 만들기 예시
@DisplayName( "체스판 다시 칠하기 - 승구" )
class Main1018Test {

    @Test
    @DisplayName( "체스판 다시 칠하기 테스트 케이스 1" )
    void test_case_1 () throws Exception {
        // given
        BufferedReader reader = TestFileUtil.getReader( this.getClass(),
                                                        "testcase/class2/1018/test_case1.txt" );
        // when
        int solution = Main1018.solution( reader );

        // then
        assertEquals( 1, solution );

    }

}

```

## <img src="https://img.icons8.com/color/48/null/github--v1.png" width="30" height="30" style="padding: 0;margin-bottom:-5px;"/> Git commit convention

- feat : 새로운 기능의 추가
- fix: 버그 수정
- docs: 문서 수정 (README)
- style: 스타일 관련 기능(코드 포맷팅, 세미콜론 누락, 코드 자체의 변경이 없는 경우)
- refactor: 코드 리펙토링
- test: 테스트 코트, 리펙토링 테스트 코드 추가
- chore: 빌드 업무 수정, 패키지 매니저 수정(ex .gitignore 수정 같은 경우)
- remove : 파일을 삭제하는 작업만 수행한 경우
- comment : 필요한 주석 추가 및 변경

## Contributors

<table >
    <tr height="140px">
        <td align="center" width="130px">
            <a href="https://github.com/cyeji"><img height="100px" width="100px" src="https://avatars.githubusercontent.com/u/98408267?v=4"/></a>
            <br />
            <a href="https://github.com/cyeji">cyeji</a>
        </td>
        <td align="center" width="130px">
            <a href="https://github.com/seunggulee1007"><img height="100px" width="100px" src="https://avatars.githubusercontent.com/u/32692807?v=4"/></a>
            <br />
            <a href="https://github.com/seunggulee1007">seunggulee1007</a>
        </td>
        <td align="center" width="130px">
            <a href="https://github.com/songjuAhn"><img height="100px" width="100px" src="https://avatars.githubusercontent.com/u/18460680?v=4"/></a>
            <br />
            <a href="https://github.com/songjuAhn">songjuAhn</a>
        </td>
    </tr>
    <tr height="50px">
        <td align="center">
            <img src="http://mazassumnida.wtf/api/mini/generate_badge?boj=goe152" />
            <br />
            <a href="https://www.acmicpc.net/user/goe152">Baekjoon</a>
            <br />
            <a href="https://solved.ac/profile/goe152">solved.ac</a>
        </td>
        <td align="center">
            <img src="http://mazassumnida.wtf/api/mini/generate_badge?boj=leesg107" />
            <br />
            <a href="https://www.acmicpc.net/user/leesg107">Baekjoon</a>
            <br />
            <a href="https://solved.ac/profile/leesg107">solved.ac</a>
        </td>
        <td align="center">
            <img src="http://mazassumnida.wtf/api/mini/generate_badge?boj=ggb06104" />
            <br />
            <a href="https://www.acmicpc.net/user/ggb06104">Baekjoon</a>
            <br />
            <a href="https://solved.ac/profile/ggb06104">solved.ac</a>
        </td>
    </tr>
    <tr height="20px">
        <td align="center">
            목표 : 플래티넘
        </td>
        <td align="center">
           목표 : 다이아
           
        </td>
        <td align="center">
           목표 : 플래티넘
        </td>
    </tr>
</table>
