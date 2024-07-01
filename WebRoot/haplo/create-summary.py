import sys

inf=sys.argv[1]
pedfile=inf

name2pop=dict()
with open('/usr/local/tomcat/webapps/cannseek/haplo/stock_pop.tsv') as fin:
	line=fin.readline().rstrip()
	while line:
		cols=line.split("\t")
		newname=cols[0].replace(",","_").replace(" ","_").replace(":","_").replace("'","_")
		name2pop[newname]=cols[1].lower()
		line=fin.readline().rstrip()
        print(name2pop)

with open(pedfile+'out.fam') as fin, open(pedfile.replace(".ped","") + '.summary.txt','w') as fout:
#VARIETY	ASSAY	SUBPOPULATION	MISMATCH	COLUMNS
#"PUTTU NELLU::IRGC 55346-1"	IRIS_313-9969	indx	18.00	25
#"MUTTU SAMBA::IRGC 36333-1"	IRIS_313-9039	ind2	18.00	25
#"KOTTEYARAN::IRGC 47383-1"	IRIS_313-8660	ind2	18.00	25	
	fout.write("VARIETY\tASSAY\tSUBPOPULATION\tMISMATCH\tCOLUMNS\n")
	line=fin.readline()
	while line:
		var=line.rstrip().split(" ")[0]
                print(var)
		#fout.write("\""+var+"\"\t\""+var+"\"\tcsativa\t\t\n")
		if var in name2pop:
			fout.write("\""+var+"\"\t\""+var+"\"\t" + name2pop[var] + "\t\t\n")
		else:
			fout.write("\""+var+"\"\t\""+var+"\"\tcsativa\t\t\n")
		line=fin.readline()
