package com.example.codingtest_1.sparta.Day6Test;

import java.io.*;
import java.util.LinkedList;

public class Test3 {

    static String input;
    static String[] ipArr;

    static String result;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        input = br.readLine();

        if(input.contains("::")) {
            input = input.replace("::", ":zero:");
        }

        ipArr = input.split(":");

        LinkedList<String> inputList = new LinkedList<>();
        LinkedList<String> resultList = new LinkedList<>();

        for(int i=0; i<ipArr.length; i++) {
            inputList.add(ipArr[i]);
        }

        for(int i=0; i<inputList.size(); i++) {
            String str = inputList.get(i);
            if(str.isEmpty()) continue;

            while(str.length() < 4) {
                str = "0" + str;
            }
            resultList.add(str);
        }

        String[] ans = new String[8];
        int zeroLen = 8 - resultList.size() + 1;
        int idx = 0;
        for(int i=0; i<resultList.size(); i++) {
            if(resultList.get(i).equals("zero")) {
                while(zeroLen-- > 0) {
                    ans[idx] = "0000";
                    idx++;
                }
            }
            else {
                ans[idx] = resultList.get(i);
                idx++;
            }
        }

        String outPut = ans[0];
        for(int i=1; i<ans.length; i++) {
            outPut = outPut + ":" + ans[i];
        }

        bw.write(outPut);

        br.close();
        bw.close();
    }

}