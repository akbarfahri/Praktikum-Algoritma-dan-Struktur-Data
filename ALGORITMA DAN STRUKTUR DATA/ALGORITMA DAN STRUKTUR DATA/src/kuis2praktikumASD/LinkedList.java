package kuis2praktikumASD;

public class LinkedList {

        Node_21 head;
        Node_21 tail;
    
        public LinkedList() {
            this.head = null;
            this.tail = null;
        }
    
        public boolean isEmpty() {
            return head == null;
        }

        public void tambahAntrian(pesanan_21 pesanan) {
            Node_21 newNode = new Node_21(pesanan);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }
    
        
        public void cetakAntrian() {
            Node_21 current = head;
            while (current != null) {
                System.out.println("Kode Pesanan: " + current.data.KodePesanan + ", Nama Pembeli: " + current.data.pembeli.namaPembeli + 
                                    ", No HP: " + current.data.pembeli.NoHp + ", Nama Pesanan: " + current.data.NamaPesanan );
                current = current.next;
            }
        }
    
        
        public void hapusAntrian() {
            if (head == null) {
                System.out.println("Antrian kosong");
            } else if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
        }
    
        
        public void hapusAntrian(int nomorAntrian) {
            if (head == null) {
                System.out.println("Antrian kosong");
            } else if (nomorAntrian < 1 || nomorAntrian > size()) {
                System.out.println("Nomor antrian tidak valid");
            } else {
                Node_21 current = head;
                for (int i = 1; i < nomorAntrian; i++) {
                    current = current.next;
                }
                if (current == head) {
                    head = current.next;
                    if (head != null) {
                        head.prev = null;
                    }
                } else if (current == tail) {
                    tail = current.prev;
                    tail.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                System.out.println("Antrian nomor " + nomorAntrian + " berhasil dihapus");
            }
        }
    
        
        public int size() {
            int count = 0;
            Node_21 current = head;
            while (current != null) {
                count++;
                current = current.next;
            }
            return count;
        }
    
        
        public void laporanPesanan() {
            Node_21 current = head;
            int totalPendapatan = 0;
            while (current != null) {
                System.out.println("Kode Pesanan: " + current.data.KodePesanan + ", Nama Pembeli: " + current.data.pembeli.namaPembeli + ", No HP: " + current.data.pembeli.NoHp +
                                   ", Nama Pesanan: " + current.data.NamaPesanan + ", Harga: " + current.data.harga);
                totalPendapatan += current.data.harga;
                current = current.next;
            }
            System.out.println("Total Pendapatan: " + totalPendapatan);
        }
    }
    
    

