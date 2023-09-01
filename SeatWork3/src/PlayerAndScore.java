public record PlayerAndScore(String name, int score) {
    public String toString(){
        return "(" + this.name + "," + score + ")";
    }
}
