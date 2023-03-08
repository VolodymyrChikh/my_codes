#include <iostream>

#include "filling.h"
#include "choco_bar.h"
#include "candy_bar.h"

using std::cout;
using std::endl;
using sweets::Filling;
using sweets::ChocoBar;
using sweets::CandyBar;

int main() {

    Filling nuts("Almonds", 30);
    Filling coco("Coconut", 45);
    nuts.PrintFillingInfo();
    coco.PrintFillingInfo();
    cout << "\n\n";

//    Filling *bar = new ChocoBar();
    ChocoBar bar("Mars", "Caramel", 35, 32.5);
    bar.PrintFillingInfo();
    cout << "ChocoBar: " << bar << endl << endl;

    CandyBar candy("Snickers", "Peanuts", 35, 28.1);
    CandyBar bounty("Bounty", coco, 25.7);
    candy.PrintCandyInfo();
    cout << "Candy bar: " << bounty << "\n\n";

    return 0;
}
