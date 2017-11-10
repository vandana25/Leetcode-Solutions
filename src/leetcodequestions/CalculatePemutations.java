package leetcodequestions;

public class CalculatePemutations {
	char temp;

	public void allPermutations(String seq, int s, int e) {
		if (s == e)
			System.out.println(seq);
		else {
			for (int i = s; i <= e; i++) {
				seq = swap(seq, s, i);
				allPermutations(seq, s + 1, e);
				seq = swap(seq, s, i);
			}
		}
	}

	public String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	public static void main(String[] args) {
		String sequenceOfNumbers = "12345";
		CalculatePemutations calculatePemutations = new CalculatePemutations();
		calculatePemutations.allPermutations(sequenceOfNumbers, 0, sequenceOfNumbers.length() - 1);

	}

}
