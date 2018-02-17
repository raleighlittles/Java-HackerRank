    import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque<Integer> deque = new ArrayDeque<>();
            HashSet<Integer> set = new HashSet<>();
            int n = in.nextInt();
            int m = in.nextInt();
            int maximum = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                
                deque.add(num);
                set.add(num);
                
                if (deque.size() == m)
                {
                    
                    if (set.size() > maximum)
                    {
                        maximum = set.size();
                        
                    }
                        int first = deque.remove();
                        
                        if (!(deque.contains(first)))
                        {
                            set.remove(first);
                        }
                    
                }
               
                               
            }
            
            System.out.println(maximum);
        }
    }
