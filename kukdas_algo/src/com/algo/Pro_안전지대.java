package com.algo;

public class Pro_안전지대 {
	public static void main(String[] args) {
		int[][] board = {{1,1,1,1,1,1}, {1,1,1,1,1,1}, {1,1,1,1,1,1}, {1,1,1,1,1,1}, {1,1,1,1,1,1}, {1,1,1,1,1,1}};
		int boardSize = board.length;
        int answer = 0;
        int[] dirY = {-1, -1, 0, 1, 1, 1, 0, -1};
        int[] dirX = {0, 1, 1, 1, 0, -1, -1, -1};
        int[][] safeBoard = new int[boardSize][boardSize];
        for(int y=0;y<boardSize;y++){
            for(int x=0;x<boardSize;x++){
                if (board[y][x] == 1){
                    safeBoard[y][x] = 1;
                    for(int a=0;a<8;a++){
                        int ny = y + dirY[a];
                        int nx = x + dirX[a];
                        if (0>ny || boardSize<=ny || 0>nx || boardSize<=nx) continue;
                        else {
                        	safeBoard[ny][nx] = 1;
                        }
                    }
                }
            }
        }
        
        for(int y=0;y<boardSize;y++){
            for(int x=0;x<boardSize;x++){
                if (safeBoard[y][x]==0){
                    answer++;
                }
            }
        }
        System.out.println(answer);
	}
}
