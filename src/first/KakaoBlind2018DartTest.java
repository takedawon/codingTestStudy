package first;

public class KakaoBlind2018DartTest {
    public static void main(String[] args) {
        System.out.println(solution("1D*2S*10S*")); // 4 8 20
        System.out.println(solution("1D2S3T*")); //59 1 4 54
        System.out.println(solution("3S*2S*3T*")); //108 8 54
}

    public static int solution(String dartResult) { // 1 4 54
        int answer = 0;
        double now = 0;
        double eng = 0;
        double firstBefore = 0;
        double twoBefore = 0;
        int lng =0;
        int init = 0;

        for (char a : dartResult.toCharArray()) {
            if (a >= '0' && a <= '9') {
                if(lng==1) { // 10일경우
                    now=10.0;
                } else {
                    now = a - '0';
                    lng++;
                }//System.out.println(solution("3T*2S*3T*")); //
            } else if (a == 'S') {
                eng = Math.pow(now, 1);
                init++;
                if(init == 2) {
                    twoBefore = eng;
                }
                answer += eng;
                lng=0;
            } else if (a == 'D') {
                eng = Math.pow(now, 2);
                init++;
                if(init == 2) {
                    twoBefore = eng;
                }
                answer += eng;
                lng=0;
            } else if (a == 'T') {
                eng = Math.pow(now, 3);
                init++;
                if(init == 2) {
                    twoBefore = eng;
                }
                answer += eng;
                lng=0;
            } else if (a == '*') {
                answer -= eng;

                if(init == 2) {
                    twoBefore = answer;
                }
                if(init == 3) {
                    firstBefore = answer-twoBefore;
                    answer-=firstBefore;
                }
                answer *= 2;

                eng *= 2;
                if(init == 2) {
                    twoBefore = answer;
                }
                if(init == 3) {
                    answer += firstBefore;
                }
                answer += eng;
            } else if (a == '#') {
                answer -= eng;
                eng *= -1;
                answer += eng;
            }

        }
        return answer;
    }
}
