package skill_check_test_level_2_retry_2;

public class Problem1 {

    static private final int[][] displacement = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}};

    static private int numberOfArea = 0;

    static private int maxAreaSize = 0;

    static private int areaSize = 0;

    static private int rowSize = 0;

    static private int colSize = 0;

    private void dfs(int[][] picture, boolean[][] visited, int row, int col) {
        visited[row][col] = true;
        areaSize++;
        for (int i = 0; i < 4; i++) {
            int nextRow = row + displacement[i][0];
            int nextCol = col + displacement[i][1];
            if (nextRow < 0 || nextRow >= rowSize || nextCol < 0 || nextCol >= colSize) {
                continue;
            }
            if (picture[row][col] == picture[nextRow][nextCol] && !visited[nextRow][nextCol]) {
                dfs(picture, visited, nextRow, nextCol);
            }
        }
    }

    public int[] solution(int m, int n, int[][] picture) {
        boolean[][] visited = new boolean[m][n];
        numberOfArea = 0;
        maxAreaSize = 0;
        rowSize = m;
        colSize = n;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (picture[i][j] != 0 && !visited[i][j]) {
                    numberOfArea++;
                    dfs(picture, visited, i, j);
                }
                maxAreaSize = maxAreaSize < areaSize ? areaSize : maxAreaSize;
                areaSize = 0;
            }
        }
        return new int[]{numberOfArea, maxAreaSize};
    }

}
