#include <iostream>

#include "filling.h"

using std::cout;
using std::endl;
using sweets::Filling;

int main() {

    Filling nuts("Almonds", 30);
    Filling coco("Coconut", 45);
    nuts.PrintFillingInfo();
    coco.PrintFillingInfo();
    cout << "\n\n";




    return 0;
}
