using System;

namespace Holy_Cow_V0
{
#if WINDOWS || LINUX
    /// <summary>
    /// The main class.
    /// </summary>
    public static class Program
    {
        /// <summary>
        /// The main entry point for the application.
        /// </summary>
        [STAThread]
        static void Main()
        {
            Console.WriteLine("Hello");
            using (var game = new Game1())
                game.Run();
        }
    }
#endif
}
