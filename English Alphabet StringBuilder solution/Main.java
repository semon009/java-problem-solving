class EnglishAlphabet {

    public static StringBuilder createEnglishAlphabet() {
        // write your code here
        StringBuilder sb = new StringBuilder();
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            if(ch != 'Z'){
                sb.append(ch +" ");
            }else {
                sb.append(ch);
            }
        }
        return sb;
    }

    public static void main(String[] args) {
        System.out.println(createEnglishAlphabet());
    }
}
