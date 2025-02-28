package swea;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class swea1248 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        for(int t = 1; t <= T; t++){
            int V = sc.nextInt();       // 정점 개수
            int E = sc.nextInt();       // 간선 개수

            int case1 = sc.nextInt();   // 조상 찾는 정점
            int case2 = sc.nextInt();   

            int tree[][] = new int[V+1][3];

            for(int i = 0; i < V-1; i++){
                
                int parent = sc.nextInt();
                int child = sc.nextInt();

                if(tree[parent][0] == 0){
                    tree[parent][0] = child;
                }else{
                    tree[parent][1] = child;
                }

                tree[child][2] = parent;
            }        

            // case1의 경우
            // 여기에 맨 밑 노드부터 타고 올라가면서 만나는 부모 노드 다 저장
            ArrayList<Integer> parentList = new ArrayList<>();
            while (true) { 
                if(tree[case1][2] != 0){
                    parentList.add(tree[case1][2]);
                    case1 = tree[case1][2];
                }else{
                    break;
                }
            }

            ArrayList<Integer> parentList2 = new ArrayList<>();
            while (true) { 
                if(tree[case2][2] != 0){
                    parentList2.add(tree[case2][2]);
                    case2 = tree[case2][2];
                }else{
                    break;
                }
            }

            
            // 해시 셋 사용해서 중복 요소 제거 후 공통값 저장
            int ans = 0;
            HashSet<Integer> set= new HashSet<>(parentList);
            ArrayList<Integer> common = new ArrayList<>();
            for(int num : parentList2){
                if(set.contains(num)){
                    common.add(num);
                }
            }
            for(int i=0; i<common.size(); i++){
                ans = Math.max(common.get(i), ans);
            }

            Stack<Integer> stack = new Stack<>();

            stack.push(ans);
            int count = 0;

            while(!stack.isEmpty()){
                int node = stack.pop();
                count ++ ;          // 자기 자신도 서브 트리 개수에 포함함

                // 왼쪽 자식 추가
                if(tree[node][0] !=0) stack.push(tree[node][0]);

                // 오른쪽 자식 추가
                if(tree[node][1] !=0) stack.push(tree[node][1]);
            }


            System.out.println("#" + t + " " + ans + " " + count);
        }
    }
}
