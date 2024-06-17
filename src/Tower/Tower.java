package Tower;

import java.util.*;

public class Tower {
	static int[] fact;
	static int[] A;
	static int[] B;
	static int[] C;
	static int x = 1;
	//test commit

	public static void main(String args[]) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the number of disks (max :6)");
		int n = myObj.nextInt();
		int noOfDiscs = n;
		System.out.println("Towers of Hanoi Solver");
		System.out.println("Input number of disks (max 6): " + noOfDiscs);
		System.out.println(
				"--------------------------------------------------------------------------------------------------");
		System.out.println("                                    " + "Tower A" + "                 " + "Tower B"
				+ "                 " + "Tower C");
		System.out.println(
				"--------------------------------------------------------------------------------------------------");
		System.out.println("Initial State: " + "                     "
				+ factorial(noOfDiscs).replaceAll("\\[", "").replaceAll("\\]", "") + "       "
				+ Arrays.toString(B).replaceAll("\\[", "").replaceAll("\\]", "") + "       "
				+ Arrays.toString(C).replaceAll("\\[", "").replaceAll("\\]", ""));
		transfer(noOfDiscs, "A", "C", "B");
	}

	public static void transfer(int n, String start, String temp, String last) {
		if (n == 1) {
			perform(n, start, last);
			System.out.println("Step :" + x + " (Move " + n + " from " + start + " to " + last + ")" + "        "
					+ Arrays.toString(A).replaceAll("\\[", "").replaceAll("\\]", "") + "       "
					+ Arrays.toString(B).replaceAll("\\[", "").replaceAll("\\]", "") + "       "
					+ Arrays.toString(C).replaceAll("\\[", "").replaceAll("\\]", ""));
		} else {
			transfer(n - 1, start, last, temp);
			perform(x + 1, start, last);
			System.out.println("Step :" + (x + 1) + " (Move " + n + " from " + start + " to " + last + ")" + "        "
					+ Arrays.toString(A).replaceAll("\\[", "").replaceAll("\\]", "") + "       "
					+ Arrays.toString(B).replaceAll("\\[", "").replaceAll("\\]", "") + "       "
					+ Arrays.toString(C).replaceAll("\\[", "").replaceAll("\\]", ""));
			x = x + 2;
			transfer(n - 1, temp, start, last);

		}

	}

	public static String factorial(int x) {
		fact = new int[x];
		A = new int[x];
		B = new int[x];
		C = new int[x];
		int i = 0;
		while (x > 0) {
			fact[i] = x;
			A[i] = x;
			// B[i] = x;
			// C[i] = x;
			i++;
			x--;
		}
		return Arrays.toString(fact);
	}

	public static void perform(int y, String sta, String la) {
		if (sta == "A" && la == "B") {
			// System.out.println(y + " " + sta + " , " + la);
			// The below is the logic for the code
			int lim1 = A.length;
			int lim2 = B.length;
			int from1 = 0;
			for (int i = lim1 - 1; i >= 0; i--) {
				if (A[i] != 0) {
					from1 = A[i];
					A[i] = 0;
					break;
				}
			}
			for (int j = 0; j < lim2; j++) {
				if (B[j] == 0) {
					B[j] = from1;
					break;
				}
			}
		}
		if (sta == "A" && la == "C") {
			// System.out.println(y + " " + sta + " , " + la);
			// The below is the logic for the code
			int lim3 = A.length;
			int lim4 = C.length;
			int from2 = 0;
			for (int k = lim3 - 1; k >= 0; k--) {
				if (A[k] != 0) {
					from2 = A[k];
					A[k] = 0;
					break;
				}
			}
			for (int l = 0; l < lim4; l++) {
				if (C[l] == 0) {
					C[l] = from2;
					break;
				}
			}
		}
		if (sta == "B" && la == "C") {
			// System.out.println(y + " " + sta + " , " + la);
			// The below is the logic for the code
			int lim5 = B.length;
			int lim6 = C.length;
			int from3 = 0;
			for (int m = lim5 - 1; m >= 0; m--) {
				if (B[m] != 0) {
					from3 = B[m];
					B[m] = 0;
					break;
				}
			}
			for (int n = 0; n < lim6; n++) {
				if (C[n] == 0) {
					C[n] = from3;
					break;
				}
			}

		}
		if (sta == "C" && la == "A") {
			// System.out.println(y + " " + sta + " , " + la);
			// The below is the logic for the code
			int lim7 = C.length;
			int lim8 = A.length;
			int from4 = 0;
			for (int o = lim7 - 1; o >= 0; o--) {
				if (C[o] != 0) {
					from4 = C[o];
					C[o] = 0;
					break;
				}
			}
			for (int p = 0; p < lim8; p++) {
				if (A[p] == 0) {
					A[p] = from4;
					break;
				}
			}

		}
		if (sta == "C" && la == "B") {
			// System.out.println(y + " " + sta + " , " + la);
			// The below is the logic for the code
			int lim9 = C.length;
			int lim10 = B.length;
			int from5 = 0;
			for (int q = lim9 - 1; q >= 0; q--) {
				if (C[q] != 0) {
					from5 = C[q];
					C[q] = 0;
					break;
				}
			}
			for (int r = 0; r < lim10; r++) {
				if (B[r] == 0) {
					B[r] = from5;
					break;
				}
			}

		}
		if (sta == "B" && la == "A") {
			// System.out.println(y + " " + sta + " , " + la);
			// The below is the logic for the code
			int lim11 = B.length;
			int lim12 = A.length;
			int from6 = 0;
			for (int s = lim11 - 1; s >= 0; s--) {
				if (B[s] != 0) {
					from6 = B[s];
					B[s] = 0;
					break;
				}
			}
			for (int t = 0; t < lim12; t++) {
				if (A[t] == 0) {
					A[t] = from6;
					break;
				}
			}

		}

	}

}

