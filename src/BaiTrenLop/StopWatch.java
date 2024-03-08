package BaiTrenLop;

import java.util.Random;

public class StopWatch
{
    private long startTime, endTime;

    public long getStartTime()
    {
        return startTime;
    }

    public long getEndTime()
    {
        return endTime;
    }

    public StopWatch()
    {
        startTime = System.currentTimeMillis();
    }

    public void start()
    {
        startTime = System.currentTimeMillis();
    }

    public void stop()
    {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime()
    {
        return endTime - startTime;
    }
}

class MainStopWatch
{
    public static void main(String[] args)
    {
        StopWatch stopWatch = new StopWatch();
        Random random = new Random();
        int[] arr = new int[10000];
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            arr[i] = random.nextInt(10000);
        }
        for (int i : arr)
        {
            System.out.print(i + " /");
        }
        System.out.println();
        stopWatch.start();
        SelectionSort(arr);
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
        for (int i : arr)
        {
            System.out.print(i + " /");
        }
    }

    public static void SelectionSort(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            int temp = arr[i];
            for (int j = i + 1; j < n; j++)
            {
                if (temp < arr[j])
                {
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i--;
                    break;
                }
            }
        }
    }
}
