public class TokenPass {

    private int[] board;
    private int cur;

    public TokenPass(int n){
        board = new int[n];
        for(int i = 0; i < board.length; i++){
            board[i] = (int)(Math.random() * 10) + 1;
        }
        cur = (int)(Math.random() * (n - 2));
    }

    public void printBoard(){
        String str = "";
        for(int i = 0; i < board.length; i++){
            str += "Player " + i + ": " + board[i] + " ";
        }
        System.out.println(str);
        System.out.println("Current Player: " + cur);
    }
    public void distributePlayerTokens(){
        int x = cur + 1;
        int a = board[cur];
        board[cur] = 0;
        for(int i = 0; i < a; i++){
            if(x == board.length){
                x = 0;
            }
            board[x]++;
            x++;
        }
    }
    public void nextPlayer(){
        cur++;
        if(cur == board.length){
            cur = 0;
        }
    }
    public int gameOver(){
        for(int i = 0; i < board.length; i++){
            if(board[i] == 0){
                return i;
            }
        }
        return -1;
    }
}
