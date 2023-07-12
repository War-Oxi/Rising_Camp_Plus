import java.io.*;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//        LinkedList<Character> Editor = new LinkedList<>();
        Stack<Character> Editor = new Stack<>();
        Stack<Character> tmpStack = new Stack<>();

        String inputText = br.readLine();
        for(int i=0; i<inputText.length(); i++){
            Editor.add(inputText.charAt(i));
        }

        int numOfCommand = Integer.parseInt(br.readLine());
        int idx = Editor.size();

        for(int i=0; i<numOfCommand; i++){
            String Command = br.readLine();;
            if(Command.charAt(0) == 'L'){
                if(idx == 0) {
                    continue;
                }
                tmpStack.add(Editor.pop());
                idx--;
            } else if (Command.charAt(0) == 'D') {
                if(idx == Editor.size() + tmpStack.size()) {
                    continue;
                }
                Editor.add(tmpStack.pop());
                idx++;
            } else if (Command.charAt(0) == 'B') {
                if(idx == 0) {
                    continue;
                }
                Editor.pop();
                idx--;
            } else if (Command.charAt(0) == 'P') {
                Editor.add(idx, Command.charAt(2));
                idx++;
            } else {
                bw.write("잘못된 명력어 입력. 프로그램 종료");
                return;
            }
        }
        while(!tmpStack.empty()){
            Editor.push(tmpStack.pop());
        }
        for (Character ele : Editor) {
            bw.write(ele);
        }
        bw.flush();
        bw.close();
    }
}
