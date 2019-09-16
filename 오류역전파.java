package asdasd;
import java.util.*;;

public class backpropagagion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double[][] training = new double[75][4]; // training data
        double[][] target = new double[75][3]; // target value 
        double[][] test = new double[75][4]; // testing data
        
        // 순수 입력 ************************************************************************************************
        test[0][0]= 7.2;     test[0][1]= 3.2;     test[0][2]= 6.0;       test[0][3]= 1.8;
        test[1][0]= 6.2;     test[1][1]= 2.8;     test[1][2]= 4.8;       test[1][3]= 1.8;
        test[2][0]= 6.1;     test[2][1]= 3.0;     test[2][2]= 4.9;       test[2][3]= 1.8;
        test[3][0]= 6.4;     test[3][1]= 2.8;     test[3][2]= 5.6;       test[3][3]= 2.1;
        test[4][0]= 7.2;     test[4][1]= 3.0;     test[4][2]= 5.8;       test[4][3]= 1.6;
        test[5][0]= 7.4;     test[5][1]= 2.8;     test[5][2]= 6.1;       test[5][3]= 1.9;
        test[6][0]= 7.9;     test[6][1]= 3.8;     test[6][2]= 6.4;       test[6][3]= 2.0;
        test[7][0]= 6.4;     test[7][1]= 2.8;     test[7][2]= 5.6;       test[7][3]= 2.2;
        test[8][0]= 6.3;     test[8][1]= 2.8;     test[8][2]= 5.1;       test[8][3]= 1.5;
        test[9][0]= 6.1;     test[9][1]= 2.6;     test[9][2]= 5.6;       test[9][3]= 1.4;
        test[10][0]= 7.7;    test[10][1]= 3.0;    test[10][2]= 6.1;      test[10][3]= 2.3;
        test[11][0]= 6.3;    test[11][1]= 3.4;    test[11][2]= 5.6;      test[11][3]= 2.4;
        test[12][0]= 6.4;    test[12][1]= 3.1;    test[12][2]= 5.5;      test[12][3]= 1.8;
        test[13][0]= 6.0;    test[13][1]= 3.0;    test[13][2]= 4.8;      test[13][3]= 1.8;
        test[14][0]= 6.9;    test[14][1]= 3.1;    test[14][2]= 5.4;      test[14][3]= 2.1;
        test[15][0]= 6.7;    test[15][1]= 3.1;    test[15][2]= 5.6;      test[15][3]= 2.4;
        test[16][0]= 6.9;    test[16][1]= 3.1;    test[16][2]= 5.1;      test[16][3]= 2.3;
        test[17][0]= 5.8;    test[17][1]= 2.7;    test[17][2]= 5.1;      test[17][3]= 1.9;
        test[18][0]= 6.8;    test[18][1]= 3.2;    test[18][2]= 5.9;      test[18][3]= 2.3;
        test[19][0]= 6.7;    test[19][1]= 3.3;    test[19][2]= 5.7;      test[19][3]= 2.5;
        test[20][0]= 6.7;    test[20][1]= 3.0;    test[20][2]= 5.2;      test[20][3]= 2.3;
        test[21][0]= 6.3;    test[21][1]= 2.5;    test[21][2]= 5.0;      test[21][3]= 1.9;
        test[22][0]= 6.5;    test[22][1]= 3.0;    test[22][2]= 5.2;      test[22][3]= 2.0;
        test[23][0]= 6.2;    test[23][1]= 3.4;    test[23][2]= 5.4;      test[23][3]= 2.3;
        test[24][0]= 5.9;    test[24][1]= 3.0;    test[24][2]= 5.1;      test[24][3]= 1.8;
        test[25][0]= 6.6;    test[25][1]= 3.0;    test[25][2]= 4.4;      test[25][3]= 1.4;
        test[26][0]= 6.8;    test[26][1]= 2.8;    test[26][2]= 4.8;      test[26][3]= 1.4;
        test[27][0]= 6.7;    test[27][1]= 3.0;    test[27][2]= 5.0;      test[27][3]= 1.7;
        test[28][0]= 6.0;    test[28][1]= 2.9;    test[28][2]= 4.5;      test[28][3]= 1.5;
        test[29][0]= 5.7;    test[29][1]= 2.6;    test[29][2]= 3.5;      test[29][3]= 1.0;
        test[30][0]= 5.5;    test[30][1]= 2.4;    test[30][2]= 3.8;      test[30][3]= 1.1;
        test[31][0]= 5.5;    test[31][1]= 2.4;    test[31][2]= 3.7;      test[31][3]= 1.0;
        test[32][0]= 5.8;    test[32][1]= 2.7;    test[32][2]= 3.9;      test[32][3]= 1.2;
        test[33][0]= 6.0;    test[33][1]= 2.7;    test[33][2]= 5.1;      test[33][3]= 1.6;
        test[34][0]= 5.4;    test[34][1]= 3.0;    test[34][2]= 4.5;      test[34][3]= 1.5;
        test[35][0]= 6.0;    test[35][1]= 3.4;    test[35][2]= 4.5;      test[35][3]= 1.6;
        test[36][0]= 6.7;    test[36][1]= 3.1;    test[36][2]= 4.7;      test[36][3]= 1.5;
        test[37][0]= 6.3;    test[37][1]= 2.3;    test[37][2]= 4.4;      test[37][3]= 1.3;
        test[38][0]= 5.6;    test[38][1]= 3.0;    test[38][2]= 4.1;      test[38][3]= 1.3;
        test[39][0]= 5.5;    test[39][1]= 2.5;    test[39][2]= 4.0;      test[39][3]= 1.3;
        test[40][0]= 5.5;    test[40][1]= 2.6;    test[40][2]= 4.4;      test[40][3]= 1.2;
        test[41][0]= 6.1;    test[41][1]= 3.0;    test[41][2]= 4.6;      test[41][3]= 1.4;
        test[42][0]= 5.8;    test[42][1]= 2.6;    test[42][2]= 4.0;      test[42][3]= 1.2;
        test[43][0]= 5.0;    test[43][1]= 2.3;    test[43][2]= 3.3;      test[43][3]= 1.0;
        test[44][0]= 5.6;    test[44][1]= 2.7;    test[44][2]= 4.2;      test[44][3]= 1.3;
        test[45][0]= 5.7;    test[45][1]= 3.0;    test[45][2]= 4.2;      test[45][3]= 1.2;
        test[46][0]= 5.7;    test[46][1]= 2.9;    test[46][2]= 4.2;      test[46][3]= 1.3;
        test[47][0]= 6.2;    test[47][1]= 2.9;    test[47][2]= 4.3;      test[47][3]= 1.3;
        test[48][0]= 5.1;    test[48][1]= 2.5;    test[48][2]= 3.0;      test[48][3]= 1.1;
        test[49][0]= 5.7;    test[49][1]= 2.8;    test[49][2]= 4.1;      test[49][3]= 1.3;
        test[50][0]= 5.0;    test[50][1]= 3.0;    test[50][2]= 1.6;      test[50][3]= 0.2;
        test[51][0]= 7.0;    test[51][1]= 3.4;    test[51][2]= 1.6;      test[51][3]= 0.4;
        test[52][0]= 5.2;    test[52][1]= 3.5;    test[52][2]= 1.5;      test[52][3]= 0.2;
        test[53][0]= 5.2;    test[53][1]= 3.4;    test[53][2]= 1.4;      test[53][3]= 0.2;
        test[54][0]= 4.7;    test[54][1]= 3.2;    test[54][2]= 1.6;      test[54][3]= 0.2;
        test[55][0]= 4.8;    test[55][1]= 3.1;    test[55][2]= 1.6;      test[55][3]= 0.2;
        test[56][0]= 5.4;    test[56][1]= 3.4;    test[56][2]= 1.5;      test[56][3]= 0.4;
        test[57][0]= 5.2;    test[57][1]= 4.1;    test[57][2]= 1.5;      test[57][3]= 0.1;
        test[58][0]= 5.5;    test[58][1]= 4.2;    test[58][2]= 1.4;      test[58][3]= 0.2;
        test[59][0]= 4.9;    test[59][1]= 3.1;    test[59][2]= 1.5;      test[59][3]= 0.2;
        test[60][0]= 5.0;    test[60][1]= 3.2;    test[60][2]= 1.2;      test[60][3]= 0.2;
        test[61][0]= 5.5;    test[61][1]= 3.5;    test[61][2]= 1.3;      test[61][3]= 0.2;
        test[62][0]= 4.9;    test[62][1]= 3.6;    test[62][2]= 1.4;      test[62][3]= 0.1;
        test[63][0]= 4.4;    test[63][1]= 3.0;    test[63][2]= 1.3;      test[63][3]= 0.2;
        test[64][0]= 5.1;    test[64][1]= 3.4;    test[64][2]= 1.5;      test[64][3]= 0.2;
        test[65][0]= 5.0;    test[65][1]= 3.5;    test[65][2]= 1.3;      test[65][3]= 0.3;
        test[66][0]= 4.5;    test[66][1]= 2.3;    test[66][2]= 1.3;      test[66][3]= 0.3;
        test[67][0]= 4.4;    test[67][1]= 3.2;    test[67][2]= 1.3;      test[67][3]= 0.2;
        test[68][0]= 5.0;    test[68][1]= 3.5;    test[68][2]= 1.6;      test[68][3]= 0.6;
        test[69][0]= 5.1;    test[69][1]= 3.8;    test[69][2]= 1.9;      test[69][3]= 0.4;
        test[70][0]= 4.8;    test[70][1]= 3.0;    test[70][2]= 1.4;      test[70][3]= 0.3;
        test[71][0]= 5.1;    test[71][1]= 3.8;    test[71][2]= 1.6;      test[71][3]= 0.2;
        test[72][0]= 4.6;    test[72][1]= 3.2;    test[72][2]= 1.4;      test[72][3]= 0.2;
        test[73][0]= 5.3;    test[73][1]= 3.7;    test[73][2]= 1.5;      test[73][3]= 0.2;
        test[74][0]= 5.0;    test[74][1]= 3.3;    test[74][2]= 1.4;      test[74][3]= 0.2;
        
        //***********************************************************************************************
        training[0][0]= 6.3;     training[0][1]= 3.3;     training[0][2]= 6.0;       training[0][3]= 2.5;
        training[1][0]= 5.8;     training[1][1]= 2.7;     training[1][2]= 5.1;       training[1][3]= 1.9;
        training[2][0]= 7.1;     training[2][1]= 3.0;     training[2][2]= 5.9;       training[2][3]= 2.1;
        training[3][0]= 6.3;     training[3][1]= 2.9;     training[3][2]= 5.6;       training[3][3]= 1.8;
        training[4][0]= 6.5;     training[4][1]= 3.0;     training[4][2]= 5.8;       training[4][3]= 2.2;
        training[5][0]= 7.6;     training[5][1]= 3.0;     training[5][2]= 6.6;       training[5][3]= 2.1;
        training[6][0]= 4.9;     training[6][1]= 2.5;     training[6][2]= 4.5;       training[6][3]= 1.7;
        training[7][0]= 7.3;     training[7][1]= 2.9;     training[7][2]= 6.3;       training[7][3]= 1.8;
        training[8][0]= 6.7;     training[8][1]= 2.5;     training[8][2]= 5.8;       training[8][3]= 1.8;
        training[9][0]= 7.2;     training[9][1]= 3.6;     training[9][2]= 6.1;       training[9][3]= 2.5;
        training[10][0]= 6.5;    training[10][1]= 3.2;    training[10][2]= 5.1;      training[10][3]= 2.0;
        training[11][0]= 6.4;    training[11][1]= 2.7;    training[11][2]= 5.3;      training[11][3]= 1.9;
        training[12][0]= 6.8;    training[12][1]= 3.0;    training[12][2]= 5.5;      training[12][3]= 2.1;
        training[13][0]= 5.7;    training[13][1]= 2.5;    training[13][2]= 5.0;      training[13][3]= 2.0;
        training[14][0]= 5.8;    training[14][1]= 2.8;    training[14][2]= 5.1;      training[14][3]= 2.4;
        training[15][0]= 6.4;    training[15][1]= 3.2;    training[15][2]= 5.3;      training[15][3]= 2.3;
        training[16][0]= 6.5;    training[16][1]= 3.0;    training[16][2]= 5.5;      training[16][3]= 1.8;
        training[17][0]= 7.7;    training[17][1]= 3.8;    training[17][2]= 6.7;      training[17][3]= 2.2;
        training[18][0]= 7.7;    training[18][1]= 2.6;    training[18][2]= 6.9;      training[18][3]= 2.3;
        training[19][0]= 6.0;    training[19][1]= 2.2;    training[19][2]= 5.0;      training[19][3]= 1.5;
        training[20][0]= 6.9;    training[20][1]= 3.2;    training[20][2]= 5.7;      training[20][3]= 2.3;
        training[21][0]= 5.6;    training[21][1]= 2.8;    training[21][2]= 4.9;      training[21][3]= 2.0;
        training[22][0]= 7.7;    training[22][1]= 2.8;    training[22][2]= 6.7;      training[22][3]= 2.0;
        training[23][0]= 6.3;    training[23][1]= 2.7;    training[23][2]= 4.9;      training[23][3]= 1.8;
        training[24][0]= 6.7;    training[24][1]= 3.3;    training[24][2]= 5.7;      training[24][3]= 2.1;
        training[25][0]= 7.0;    training[25][1]= 3.2;    training[25][2]= 4.7;      training[25][3]= 1.4;
        training[26][0]= 6.4;    training[26][1]= 3.2;    training[26][2]= 4.5;      training[26][3]= 1.5;
        training[27][0]= 6.9;    training[27][1]= 3.1;    training[27][2]= 4.9;      training[27][3]= 1.5;
        training[28][0]= 5.5;    training[28][1]= 2.3;    training[28][2]= 4.0;      training[28][3]= 1.3;
        training[29][0]= 6.5;    training[29][1]= 2.8;    training[29][2]= 4.6;      training[29][3]= 1.5;
        training[30][0]= 5.7;    training[30][1]= 2.8;    training[30][2]= 4.5;      training[30][3]= 1.3;
        training[31][0]= 6.3;    training[31][1]= 3.3;    training[31][2]= 4.7;      training[31][3]= 1.6;
        training[32][0]= 4.9;    training[32][1]= 2.4;    training[32][2]= 3.3;      training[32][3]= 1.0;
        training[33][0]= 6.6;    training[33][1]= 2.9;    training[33][2]= 4.6;      training[33][3]= 1.3;
        training[34][0]= 5.2;    training[34][1]= 2.7;    training[34][2]= 3.9;      training[34][3]= 1.4;
        training[35][0]= 5.0;    training[35][1]= 2.0;    training[35][2]= 3.5;      training[35][3]= 1.0;
        training[36][0]= 5.9;    training[36][1]= 3.0;    training[36][2]= 4.2;      training[36][3]= 1.5;
        training[37][0]= 6.0;    training[37][1]= 2.2;    training[37][2]= 4.0;      training[37][3]= 1.0;
        training[38][0]= 6.1;    training[38][1]= 2.9;    training[38][2]= 4.7;      training[38][3]= 1.4;
        training[39][0]= 5.6;    training[39][1]= 2.9;    training[39][2]= 3.6;      training[39][3]= 1.3;
        training[40][0]= 6.7;    training[40][1]= 3.1;    training[40][2]= 4.4;      training[40][3]= 1.4;
        training[41][0]= 5.6;    training[41][1]= 3.0;    training[41][2]= 4.5;      training[41][3]= 1.5;
        training[42][0]= 5.8;    training[42][1]= 2.7;    training[42][2]= 4.1;      training[42][3]= 1.0;
        training[43][0]= 6.2;    training[43][1]= 2.2;    training[43][2]= 4.5;      training[43][3]= 1.5;
        training[44][0]= 5.6;    training[44][1]= 2.5;    training[44][2]= 3.9;      training[44][3]= 1.1;
        training[45][0]= 5.7;    training[45][1]= 3.2;    training[45][2]= 4.8;      training[45][3]= 1.8;
        training[46][0]= 5.9;    training[46][1]= 2.8;    training[46][2]= 4.0;      training[46][3]= 1.3;
        training[47][0]= 6.1;    training[47][1]= 2.5;    training[47][2]= 4.9;      training[47][3]= 1.5;
        training[48][0]= 6.3;    training[48][1]= 2.8;    training[48][2]= 4.7;      training[48][3]= 1.2;
        training[49][0]= 6.4;    training[49][1]= 2.9;    training[49][2]= 4.3;      training[49][3]= 1.3;
        training[50][0]= 5.1;    training[50][1]= 3.5;    training[50][2]= 1.4;      training[50][3]= 0.2;
        training[51][0]= 4.9;    training[51][1]= 3.0;    training[51][2]= 1.4;      training[51][3]= 0.2;
        training[52][0]= 4.7;    training[52][1]= 3.2;    training[52][2]= 1.3;      training[52][3]= 0.2;
        training[53][0]= 4.6;    training[53][1]= 3.1;    training[53][2]= 1.5;      training[53][3]= 0.2;
        training[54][0]= 5.0;    training[54][1]= 3.6;    training[54][2]= 1.4;      training[54][3]= 0.2;
        training[55][0]= 5.4;    training[55][1]= 3.9;    training[55][2]= 1.7;      training[55][3]= 0.4;
        training[56][0]= 4.6;    training[56][1]= 3.4;    training[56][2]= 1.4;      training[56][3]= 0.3;
        training[57][0]= 5.0;    training[57][1]= 3.4;    training[57][2]= 1.5;      training[57][3]= 0.2;
        training[58][0]= 4.4;    training[58][1]= 2.9;    training[58][2]= 1.4;      training[58][3]= 0.2;
        training[59][0]= 4.9;    training[59][1]= 3.1;    training[59][2]= 1.5;      training[59][3]= 0.1;
        training[60][0]= 5.4;    training[60][1]= 3.7;    training[60][2]= 1.5;      training[60][3]= 0.2;
        training[61][0]= 4.8;    training[61][1]= 3.4;    training[61][2]= 1.6;      training[61][3]= 0.2;
        training[62][0]= 4.8;    training[62][1]= 3.0;    training[62][2]= 1.4;      training[62][3]= 0.1;
        training[63][0]= 4.3;    training[63][1]= 3.0;    training[63][2]= 1.1;      training[63][3]= 0.1;
        training[64][0]= 5.8;    training[64][1]= 4.0;    training[64][2]= 1.2;      training[64][3]= 0.2;
        training[65][0]= 5.7;    training[65][1]= 4.4;    training[65][2]= 1.5;      training[65][3]= 0.4;
        training[66][0]= 5.4;    training[66][1]= 3.9;    training[66][2]= 1.3;      training[66][3]= 0.4;
        training[67][0]= 5.1;    training[67][1]= 3.5;    training[67][2]= 1.4;      training[67][3]= 0.3;
        training[68][0]= 5.7;    training[68][1]= 3.8;    training[68][2]= 1.7;      training[68][3]= 0.3;
        training[69][0]= 5.1;    training[69][1]= 3.8;    training[69][2]= 1.5;      training[69][3]= 0.3;
        training[70][0]= 5.4;    training[70][1]= 3.4;    training[70][2]= 1.7;      training[70][3]= 0.2;
        training[71][0]= 5.1;    training[71][1]= 3.7;    training[71][2]= 1.5;      training[71][3]= 0.4;
        training[72][0]= 4.6;    training[72][1]= 3.6;    training[72][2]= 1.0;      training[72][3]= 0.2;
        training[73][0]= 5.1;    training[73][1]= 3.3;    training[73][2]= 1.7;      training[73][3]= 0.5;
        training[74][0]= 4.8;    training[74][1]= 3.4;    training[74][2]= 1.9;      training[74][3]= 0.2;
        
        //target_value
        for(int i =0 ; i<25 ; i++ ) {
            target[i][0] =1.0;                
        }
        for(int i =25 ; i<50 ; i++ ) {
            target[i][0] = 0.0;
        }
        for(int i =50 ; i<75 ; i++ ) {
            target[i][0] = 0.0;
        }
                           //  1 0 0
        
        
        for(int i =0 ; i<25 ; i++ ) {
            target[i][1] = 0.0;                
        }
        for(int i =25 ; i<50 ; i++ ) {
            target[i][1] = 1.0;
        }
        for(int i =50 ; i<75 ; i++ ) {
            target[i][1] = 0.0;
        }                 //   0 1 0 
        
        
        for(int i =0 ; i<25 ; i++ ) {
            target[i][2] = 0.0;                
        }
        for(int i =25 ; i<50 ; i++ ) {
            target[i][2] = 0.0;
        }
        for(int i =50 ; i<75 ; i++ ) {
            target[i][2] = 1.0;
        }
        
                         //   0 0 1


        double[][] weight_I_H = new double[3][4];
        double[][] weight_H_O = new double[3][3];

        Random random = new Random();

        for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 4; j++) {
              weight_I_H[i][j] = random.nextDouble();
           }
        }

        for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 3; j++) {
              weight_H_O[i][j] = random.nextDouble();
           }
        }
        

        double[] op_H = new double[3];
        double[] op_O = new double[3];
        double[] delta1 = new double[3];
        double[] delta2 = new double[3];
        int bias = 1;
        double learningRate = 0.03;

        for (int count = 1; count < 30000; count++) { 
           for (int i = 0; i < 75; i++) {
              for (int j = 0; j < 3; j++) {
                 op_H[j] = bias;
                 for (int k = 0; k < 4; k++)
                    op_H[j] += training[i][k] * weight_I_H[j][k];
                 op_H[j] = Sigmoid(op_H[j]);
              }
              
              for (int j = 0; j < 3; j++) {
                 op_O[j] = 1;
                 for (int k = 0; k < 3; k++)
                    op_O[j] += op_H[k] * weight_H_O[j][k];
                 op_O[j] = Sigmoid(op_O[j]);
              }
              
              for (int j = 0; j < 3; j++) {
                 delta2[j] = (target[i][j] - op_O[j]) * DSigmoid(op_O[j]);
              }
              
              for (int j = 0; j < 3; j++) {
                 for (int k = 0; k < 3; k++)
                    weight_H_O[j][k] += learningRate * op_H[k] * delta2[j];
              }
              
              
              for (int j = 0; j < 3; j++) {
                 delta1[j] = 0;
                 for (int k = 0; k < 3; k++)
                    delta1[j] += delta2[k] * weight_H_O[k][j] * DSigmoid(op_H[k]);
              }
              
              for (int j = 0; j < 4; j++) {
                 for (int k = 0; k < 3; k++)
                    weight_I_H[k][j] += learningRate * training[i][j] * delta1[k];
              }
                         }
        }

        System.out.println("학습 데이터 결과");
        System.out.println("");
        for (int j = 0; j < 75; j++) {
           for (int k = 0; k < 3; k++) {
              op_H[k] = 1;
              for (int l = 0; l < 4; l++)
                 op_H[k] += training[j][l] * weight_I_H[k][l];
              op_H[k] = Sigmoid(op_H[k]);
           }

           for (int k = 0; k < 3; k++) {
              op_O[k] = 1;
              for (int l = 0; l < 3; l++)
                 op_O[k] += op_H[l] * weight_H_O[k][l];
              op_O[k] = Sigmoid(op_O[k]);
              System.out.print((j + 1)+ " : " + Math.round(op_O[k]) + "\t");
           }
           System.out.println("");
        }

        System.out.println("테스트 데이터 결과");
        System.out.println("");
        for (int j = 0; j < 75; j++) {
           for (int k = 0; k < 3; k++) {
              op_H[k] = 1;
              for (int l = 0; l < 4; l++)
                 op_H[k] += test[j][l] * weight_I_H[k][l];
              op_H[k] = Sigmoid(op_H[k]);
           }

           for (int k = 0; k < 3; k++) {
              op_O[k] = 1;
              for (int l = 0; l < 3; l++)
                 op_O[k] += op_H[l] * weight_H_O[k][l];
              op_O[k] = Sigmoid(op_O[k]);
              System.out.print((j + 1)+" : " + Math.round( op_O[k]) + "\t");
           }
           System.out.println("");
        }
     }

	static double Sigmoid(double output) {
		return 1 / (1 + Math.pow(Math.E, -output));
	}

	static double DSigmoid(double output) {
		return output * (1 - output);
	}
}