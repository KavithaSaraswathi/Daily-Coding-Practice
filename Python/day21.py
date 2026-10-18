class ShoppingCart():
    def __init__(self):
        self.dic={}
    def add_item(self,name,prize):
        self.dic[name]=prize
    def calculate_total(self):
        prize=0
        for v in self.dic.values():
            prize+=v
        print("Shopping Cart:")
        print(self.dic)
        print("Total prize:",prize)
shop1=ShoppingCart()
shop1.add_item("car",100000)
shop1.add_item("tv",10000)
shop1.add_item("cap",100)
shop1.add_item("cat",5000)
shop1.calculate_total()


