package com.epam.rd.qa.at;

public class Task {
	
	public static void main(String[] args) {
		int n=9;
		for (int i = 1; i <= n; i++) {
			int square = i * i;
			int cube = i * i * i;
			System.out.println(i + " " + square + " " + cube);
		}
		}
	}