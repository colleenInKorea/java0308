package PrivateTest;

public class Test01 {
    /*
    네오는 평소 프로도가 비상금을 숨겨놓는 장소를 알려줄 비밀지도를 손에 넣었다.
    그런데 이 비밀지도는 숫자로 암호화되어 있어 위치를 확인하기 위해서는 암호를 해독해야 한다.
     다행히 지도 암호를 해독할 방법을 적어놓은 메모도 함께 발견했다.

    1. 지도는 한 변의 길이가 n인 정사각형 배열 형태로, 각 칸은 “공백”(“ “) 또는 “벽”(“#”) 두 종류로 이루어져 있다.
    2. 전체 지도는 두 장의 지도를 겹쳐서 얻을 수 있다. 각각 “지도 1”과 “지도 2”라고 하자.
        지도 1 또는 지도 2 중 어느 하나라도 벽인 부분은 전체 지도에서도 벽이다.
        지도 1과 지도 2에서 모두 공백인 부분은 전체 지도에서도 공백이다.
        “지도 1”과 “지도 2”는 각각 정수 배열로 암호화되어 있다.
    3. 암호화된 배열은 지도의 각 가로줄에서 벽 부분을 1, 공백 부분을 0으로 부호화했을 때 얻어지는 이진수에 해당하는 값의 배열이다.

    네오가 프로도의 비상금을 손에 넣을 수 있도록, 비밀지도의 암호를 해독하는 작업을 도와줄 프로그램을 작성하라.
     */

    /*
    tip. 첫번째 문제를 JAVA로 직접 작성해 본 예제 입니다. 비교적 쉬운 문제로 OR 연산자가 | 라는 것과 Interger.toBinaryString(int n) 메소드만 안다면 큰 어려움 없이 풀만한 문제인 것 같습니다.
    출처 : https://javaplant.tistory.com/3 [자바공작소]
     */

    public static void main(String[] args) {
        int[] arr1;
        int[] arr2;

        arr1 = new int[]{9, 20, 28, 18, 11};
        arr2 = new int[]{30, 1, 21, 17, 28};
        printArr(decodeScreetMap(5, arr1, arr2));

        arr1 = new int[]{46, 33, 33 ,22, 31, 50};
        arr2 = new int[]{27 ,56, 19, 14, 14, 10};
        printArr(decodeScreetMap(6, arr1, arr2));
    }

    /**
     * 입력받은 arr1, arr2의 각 int를 or연산 처리
     * -> bynaryString으로 변환 -> 출력형태에 맞게 문자열  replace
     * @param n
     * @param arr1
     * @param arr2
     * @return
     */
    public static String[] decodeScreetMap(int n, int[] arr1, int[] arr2) {
        String[] retArr = new String[n];
        for(int i = 0; i < n; i++) {
            retArr[i] = Integer.toBinaryString(arr1[i]|arr2[i])
                    .replace("0", " ")
                    .replace("1", "#");
        }
        return retArr;
    }

    /**
     * 배열을 입력받아 println
     * @param arr
     */
    public static void printArr(String[] arr) {
        StringBuilder sb = new StringBuilder();
        for(String str: arr) {
            sb.append(", \""+str+"\"");
        }
        System.out.println(sb.toString().replaceFirst(", ", ""));
    }
// 출처 : https://javaplant.tistory.com/3 [자바공작소]
}
