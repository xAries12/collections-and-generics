class OddNumber implements Strategy<Integer> {
    public boolean test(Integer i) {
return i % 2 != 0;
}
}