            o = new Inner().new Private();
            // must make sure to cast object for it to work
            System.out.println(num + " is " + ((Solution.Inner.Private)o).powerof2(num));
