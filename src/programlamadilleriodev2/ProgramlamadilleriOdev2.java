/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programlamadilleriodev2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramlamadilleriOdev2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*LUTFEN DOSYANIN ADINI GIRINIZ****** ");
        String dosyaAdi = scanner.nextLine();
        scanner.close();

        List<dügüm> nodes = new ArrayList<>();
        List<dügüm> sortedNodes = new ArrayList<>();
        List<dügüm> copyNode = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(dosyaAdi))) {
            String line;
            int index = 0;
            while ((line = reader.readLine()) != null) {
                int data = Integer.parseInt(line);
                nodes.add(new dügüm(data, index));
                copyNode.add(new dügüm(data, index));
                index++;
            }

            sortedNodes.addAll(nodes);
            selectionSort(sortedNodes);

            System.out.println("*SIRALANMAMIS* \t\t\t*SIRALANMIS*");
            System.out.println("VERI\tPOINTER\t\t\tVERI\tPOINTER");
            for (int i = 0; i < nodes.size(); i++) {
                dügüm node = nodes.get(i);
                dügüm copy = copyNode.get(i);
                System.out.println(copy.data + "\t" + copy.adres + "\t\t\t" + node.data + "\t" + node.adres);
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static void selectionSort(List<dügüm> nodes) {
        for (int i = 0; i < nodes.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nodes.size(); j++) {
                if (nodes.get(j).data < nodes.get(minIndex).data) {
                    minIndex = j;
                }
            }
            int tempAddress = nodes.get(minIndex).adres;
            nodes.get(minIndex).adres = nodes.get(i).adres;
            nodes.get(i).adres = tempAddress;

            dügüm temp = nodes.get(minIndex);
            nodes.set(minIndex, nodes.get(i));
            nodes.set(i, temp);
        }
    }
}
