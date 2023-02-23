package codetest.programmers;

public class Solution120913 {
	public String[] solution(String my_str, int n) {
		int len = my_str.length();

		int answerLength = ((len - 1) / n) + 1;

		String[] answer = new String[answerLength];

		int start = 0;
		int end = n;

		int i = 0;
		while (start < len) {
			if (end > len) {
				end = len;
			}

			// 부분문자열 잘라서
			String sub = my_str.substring(start, end);

			// 배열에 넣고
			answer[i++] = sub;

			// start, end 변경
			start += n;
			end += n;

		}

		return answer;
	}
}
