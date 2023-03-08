#include "choco_bar.h"

using std::cout;

sweets::ChocoBar::ChocoBar()
        : Filling(), name_("#no_info"), price_(0.) {}

sweets::ChocoBar::ChocoBar(const std::string &bar_name, const std::string &filling_type, int filling_weight,
                           double bar_price)
        : Filling(filling_type, filling_weight),
          name_(bar_name),
          price_(bar_price) {

}

sweets::ChocoBar::ChocoBar(const sweets::ChocoBar &c)
        : Filling(c),
          name_(c.name_),
          price_(c.price_) {}

sweets::ChocoBar::~ChocoBar() {

}

void sweets::ChocoBar::PrintFillingInfo() const {
    // Chocolate bar: Mars
    // Filling: Caramel (50 gr)
    // Weight: 150 gr Price: 32.5 uah
    cout << "Chocolate bar: " << name_ << "\n";
    cout << "Filling: "; Filling::PrintFillingInfo();
    cout << "Weight: " << CalculateWeight() << " gr. ";
    cout << "Price: " << CalculatePrice() << " uah\n";
}

void sweets::ChocoBar::ReadFrom(std::istream &in) {
    in >> name_;
    Filling::ReadFrom(in);
    in >> price_;
}

void sweets::ChocoBar::WriteTo(std::ostream &out) const {
    out << name_ << ' ';
    Filling::WriteTo(out);
    out << ' ' << price_;
}

int sweets::ChocoBar::CalculateWeight() const {
    return get_weight() + 85;
}

double sweets::ChocoBar::CalculatePrice() const {
    double filling_price = price_ / 100.0 * (double)get_weight();
    return price_ + filling_price;
}

std::istream& sweets::operator>> (std::istream& in, sweets::ChocoBar& c)
{
    c.ReadFrom(in);
    return in;
}

std::ostream& sweets::operator<< (std::ostream& out, const sweets::ChocoBar& c)
{
    c.WriteTo(out);
    return out;
}
