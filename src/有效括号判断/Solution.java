package 有效括号判断;
import java.util.*;
class Solution {
    public boolean isValid1(String s) {
        Stack<Character> stack = new Stack<>();
        char[] ch = s.toCharArray();
        if(s == null){
            return true;
        }
        for(int i = 0;i < ch.length;i++){
            //如果栈为空就入栈
            if(stack.isEmpty()){
                stack.push(ch[i]);
            }
            //否则就查看栈顶元素与当前元素是否匹配
            //匹配就直接出栈，不匹配就查看数组中下一个元素
            else{
                char c = stack.peek();
                if((c == '(' && ch[i] == ')') || (c == '[' && ch[i] == ']')|| (c == '{' && ch[i] == '}')){
                    stack.pop();
                }
                else{
                    stack.push(ch[i]);
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }

    public boolean isValid2(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        if(s == null){
            return true;
        }
        char[] ch = s.toCharArray();
        for(int i = 0;i < ch.length;i++){
            if(ch[i] == '(' || ch[i] == '[' || ch[i] =='{'){
                stack.push(ch[i]);
                continue;
            }
            if(stack.isEmpty()){
                return false;
            }
            char c = stack.peek();
            // if((c == '(' && ch[i] == ')') || (c == '[' && ch[i] == ']')|| (c == '{' && ch[i] == '}')){
            if(map.get(c) == ch[i]){
                stack.pop();
                continue;
            }
            return false;
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}



