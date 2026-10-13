// class Solution {
//     public boolean isValid(String s) {
//         char[] p = s.toCharArray();
//         Stack<Character> para = new Stack<>();
//         for(int i=0;i<p.length;i++){
//             if(p[i]=='('||p[i]=='{'||p[i]=='['){
//                 para.push(p[i]);
//             }else{
//                 para.pop();
//             }
//         }
//         if(para.size()>0){
//             return false;
//         }
//         return true;
//     }
// }

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> para = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                para.push(ch);
            } else {
                if (para.isEmpty()) {
                    return false;
                }

                char top = para.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return para.isEmpty();
    }
}
