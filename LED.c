#include <MKL25Z4>
void delay(int n);
int main(void)
{

    SIM->SCGC5 |= 0X400;
    PORTB->PCR[19] = 0x100;
    PTB->PDDR |= 0X80000;
    while (1)
    {
        PTB->PSOR = 0x80000;
        delay(8);
        PTB->PCOR = 0x80000;
        delay(8);
    }
}

void delay(int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < 7000; j++)
        {
        }
    }
}