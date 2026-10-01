package Cobateori.Teori6;

public class Televisi23 {
    public String merek;
    public int jumlahChannel;
    private int channelAktif;

    public Televisi23() {
        this.channelAktif = 1;
    }

    public Televisi23(String merek, int jumlahChannel) {
        this.merek = merek;
        this.jumlahChannel = jumlahChannel;
        this.channelAktif = 1;
    }

    public void switchChannel(int newChannel) {
        this.channelAktif = newChannel;
    }

    public void pindahChannel(int newChannel) {
        switchChannel(newChannel);
    }

    public int getActiveChannel() {
        return this.channelAktif;
    }

    public int getChannelAktif() {
        return getActiveChannel();
    }
}