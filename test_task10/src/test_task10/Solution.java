package test_task10;

import java.io.*;
import java.util.*;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Solution {

	public static void main(String[] args) {

		String beforeMD5Str;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {

			beforeMD5Str = br.readLine();

			MessageDigest m;
			try {
				m = MessageDigest.getInstance("MD5");
				m.update(beforeMD5Str.getBytes(), 0, beforeMD5Str.length());

				System.out.println(new BigInteger(1, m.digest()).toString(16));

			} catch (NoSuchAlgorithmException e) {

				e.printStackTrace();
			}

		} catch (IOException ioe) {
			System.out.println(ioe);
		}

	}
}