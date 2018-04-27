namespace TodoApp.Services
{
    public interface IHashingService
    {
        byte[] HashHmac(byte[] key, byte[] message);
        string CreateMd5(string input);
    }
}
