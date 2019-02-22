using System;

public class HexadecimalRepresentationOfFloat
{
    public static void Main()
    {
        int tests = int.Parse(Console.ReadLine());

        for (int i = 0; i < tests; i++)
        {
            // convert float to string and place every byte representation in array
            string converted = convert(float.Parse(Console.ReadLine()));
            string[] arr = converted.Split('-');
            converted = "";

            // reverse array 
            for (int j = arr.Length - 1; j >= 0; j--)
            {
                // get rid of double zeros 
                if (arr[j][0] == '0')
                {
                    converted += arr[j][1];
                }
                else
                {
                    converted += arr[j];
                }
                // format string to pass the test
                if (j > 0)
                {
                    converted += " ";
                }
            }
            Console.WriteLine(converted.ToLower());
        }
    }

    private static string convert(float v)
    {
        // built in function to convert float to bytes
        return BitConverter.ToString(BitConverter.GetBytes(v));
    }
}

