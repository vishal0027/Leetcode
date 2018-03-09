int myAtoi(const char *str) {
    int sign = 1, base = 0, i = 0;
    while (str[i] == ' ') { i++; }                  // Handles spaces
    if (str[i] == '-' || str[i] == '+') {           // Handles Sign
        sign = 1 - 2 * (str[i++] == '-');           // Determines sign
    }
    while (str[i] >= '0' && str[i] <= '9') {
        if (base >  INT_MAX / 10 || (base == INT_MAX / 10 && str[i] - '0' > INT_MAX%10)) {   // Handles Integer 
            if (sign == 1) return INT_MAX;
            else return INT_MIN;
        }
        base  = 10 * base + (str[i++] - '0');
    }
    return base * sign;
}
int main(){
    printf("%d\n", myAtoi("   +323324") );
}