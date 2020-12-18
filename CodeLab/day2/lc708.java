class lc708 {
        public Node insert(Node head, int insertVal) {
            if(head==null){
                head = new Node(insertVal);
                head.next = head;
                return head;
            }
            Node crawl = head;
            while(crawl.next != head){
                if(crawl.val > crawl.next.val && crawl.val > insertVal && crawl.next.val > insertVal){ // 3,4,1 ins 0
                    break;
                }else
                if(crawl.val<=insertVal && crawl.next.val > insertVal){//1,3, 5  ins 4/3
                    break;
                }else if(crawl.val <=insertVal && crawl.next.val < crawl.val){//3,4,1 ins 8
                    break;
                }

                crawl = crawl.next;
            }
            Node temp = crawl.next;
            crawl.next= new Node(insertVal);
            crawl.next.next = temp;
            return head;
        }
    }
