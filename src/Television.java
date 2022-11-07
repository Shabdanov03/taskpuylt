public class Television {
    private int currentChannel;
    private int maxChannels;
    private String[] channelnames;

    public Television(int currentChannel, int maxChannels, String[] channelnames) {
        this.currentChannel = currentChannel;
        this.maxChannels = maxChannels;
        this.channelnames = channelnames;
    }

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    public void setMaxChannels(int maxChannels) {
        this.maxChannels = maxChannels;
    }

    public void setChannelnames(String[] channelnames) {
        this.channelnames = channelnames;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getMaxChannels() {
        return maxChannels;
    }

    public String[] getChannelnames() {
        return channelnames;
    }

    public void nextChannel() {
        if (currentChannel == maxChannels) {
            currentChannel = 0;
        } else {
            currentChannel++;
        }
        System.out.println(currentChannel);
    }

    public void previouschannel() {
        if (currentChannel == 0){
            currentChannel=maxChannels;
        }
        else {
            currentChannel--;
        }
        System.out.println(currentChannel);
    }
    public void changeChannelByNumber(int channelNumber){
        if (channelNumber<0){
            System.out.println(" Номер канала не может быть меньше 0 ");
        }
        else if (channelNumber>maxChannels){
            System.out.println(" Номер канала должен быть меньше чем "+ maxChannels);
        }
        else {
            currentChannel=channelNumber;
            System.out.println(currentChannel);
        }
    }
    public void setChannel(){
        for (String chan :channelnames) {
            System.out.println(chan);
        }
    }

    public String getCurrentChannelName(){
        for (int i = 0; i < channelnames.length; i++) {
            if (i==currentChannel){
                return channelnames[i];
            }
        }return "  канал не доступен .";
    }
}
