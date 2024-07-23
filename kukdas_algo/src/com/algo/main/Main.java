package com.algo.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int target = Integer.parseInt(br.readLine());

        // 배열을 그릴 공배열 생성
        int[][] nail = new int[n][n];        
        int cnt = 1, move = 1;
        // 상 우 하 좌 순서
        int[][] dir = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        int d = 0;
        // 처음 시작점
        int y = n / 2, x = n / 2;
        // 타겟 위치를 기록할 변수
        int ty = 1, tx = 1;
        // 처음 방향은 위 , 그 뒤로 시계 방향
        while (true) {
            // 2번마다 이동 횟수가 바뀌니까 배열 2개를 두었습니다.
            // 이동횟수는 초기 move = 1 로 설정
            for (int i = 0; i < move; i++) {
                // 기록하고
                nail[y][x] = cnt;
                // 만약 cnt가 최대번호라면 끝내기
                if (cnt == n * n) {
                    break;
                }
                y += dir[d][0];
                x += dir[d][1];
                // 횟수 올리기
                cnt++;
                // 타겟넘버에 도달했다면 위치 기록
                if (cnt == target) {
                    ty = y + 1;
                    tx = x + 1;
                }
            }
            // 총 4방향이 있는데 계속 반복이여서 %4로 했습니다.
            d = (d + 1) % 4;
            if (cnt == n * n) {
                break;
            }
            // 위 for문과 동일
            for (int i = 0; i < move; i++) {
                nail[y][x] = cnt;
                if (cnt == n * n) {
                    break;
                }
                y += dir[d][0];
                x += dir[d][1];
                cnt++;
                if (cnt == target) {
                    ty = y + 1;
                    tx = x + 1;
                }
            }
            d = (d + 1) % 4;
            // 2번의 이동이 끝나면 이동횟수 추가
            move++;
        }

        for (int[] arrY : nail) {
            for (int arrX : arrY) {
                bw.write(arrX + " ");
            }
            bw.write("\n");
        }
        bw.write(ty + " " + tx + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}

