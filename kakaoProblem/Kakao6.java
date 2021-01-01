package hblee;

import java.util.ArrayList;
import java.util.List;

/*
case 1.
[[1,0,0,3],[2,0,0,0],[0,0,0,2],[3,0,1,0]]
r=1, c=0
result = 14

case 2.
[[3,0,0,2],[0,0,1,0],[0,1,0,0],[2,0,0,3]]
r= 0 ,c = 1
result = 16
*/


class Node{
    int x,y;
    int val;

    public Node(int x, int y, int val) {
        super();
        this.x = x;
        this.y = y;
        this.val = val;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}

public class Kakao6 {
    static int arr[][] = new int[][] {
            {1,0,0,3},
            {2,0,0,0},
            {0,0,0,2},
            {3,0,1,0}
    };
    static int MIN = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Kakao6 kk = new Kakao6();

        int r= 1,c=0;
        int cnt=0;

        List nodes = new ArrayList<Node>();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(arr[i][j] != 0) {
                    nodes.add(new Node(i,j,arr[i][j]));
                }
            }
        }
        kk.D(r,c,cnt,nodes);
        System.out.println(MIN);
    }

    void D( int x,int y,int cnt,List<Node> list) {
        Node fd = null;

        if(list.size() ==0 ) {
            if(MIN > cnt) {
                MIN = cnt;
            }
            return;
        }

        for(int i=0; i< list.size();i++ ) {
            Node nd = list.get(i);
            int nx = nd.getX();
            int ny = nd.getY();
            List <Node> node = new ArrayList<Node>(list);

            int calCnt= cnt;

            if(nx != x && ny == y ) {
                calCnt= cnt +2;
            }else if(ny != y && nx == x) {
                calCnt = cnt+2;
            }else if(nx==x && ny==y) {
                calCnt = cnt+1;
            }else if(nx!=x && ny!=y) {
                calCnt = cnt+3;
            }

            if(list.size()%2 == 0) {
                node.remove(i);
                D(nx,ny,calCnt,node);
            }else {
                fd = new Node(x,y,arr[x][y]);

                if(nd.getVal() == fd.getVal() ) {
                    node.remove(i);
                    D(nx,ny,calCnt,node);
                }
            }
        }
    }
}
