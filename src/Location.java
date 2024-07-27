public abstract class Location {
    private Player player;
    public String name;

    public boolean onLocation(){
        return getPlayer() != null;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    //public void Location()
}
