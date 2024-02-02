public interface Lockable {
    public void setKey(int keyNum);
    public void lock();
    public void unlock();
    public boolean locked();
}
