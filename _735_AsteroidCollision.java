import java.util.Arrays;
import java.util.Stack;

public class _735_AsteroidCollision {
    public static int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            if(stack.isEmpty() || stack.peek() < 0 || asteroids[i]> 0){
                stack.add(asteroids[i]);
            }else{
                if(asteroids[i] < 0 ){
                    if(stack.peek()>0 && stack.peek() > asteroids[i]*(-1)){
                        continue;
                    }else if(stack.peek() == asteroids[i]*(-1)){
                        stack.pop();
                    }else{
                        stack.pop();
                        i--;
                    }
                }
            }
        }
        int[] res = new int[stack.size()];
        for (int i = stack.size()-1; i >=0; i--) {
            res[i] = stack.pop();
        }

        return res;
    }

    public static void main(String[] args) {
        int[] asteroids = {5,10,-5};
        System.out.println(Arrays.toString(asteroidCollision(asteroids)));
    }
}
