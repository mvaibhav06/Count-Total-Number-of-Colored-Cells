class ColoredCells {
    public long coloredCells(int n) {
        if(n==1){
            return 1;
        }else if(n==2){
            return 5;
        }else{
            return coloredCells(n-1)+(4*(n-1));
        }
        // 1 5 13 25
        //  4 8  12
    }
}
