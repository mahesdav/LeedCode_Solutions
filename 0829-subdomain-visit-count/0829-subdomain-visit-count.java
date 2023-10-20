class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {

        Map<String,Integer> domainCount = new HashMap();
        List<String> result = new ArrayList();
        for(String str : cpdomains){
            String[] spaceSplit = str.split(" ");
            int count = Integer.parseInt(spaceSplit[0]);
            String mainDomain = spaceSplit[1];
          //  String temp = sb.toString();
                // if(domainCount.containsKey(mainDomain)){
                //     int tempCount = domainCount.get(mainDomain);
                //     domainCount.put(mainDomain,count+tempCount);
                // }else{
                //     domainCount.put(mainDomain,count);
                // }
            String[] subDomain = mainDomain.split("\\.");

            StringBuilder sb = new StringBuilder();

        //    for(String subDomains : subDomain){
              int size = subDomain.length;
              for(int i=size-1;i>=0;i--){
                  String subDomains = subDomain[i];
                if(sb.toString()==""){
                  sb.append(subDomains);
                }else{
                    StringBuilder sb1 = new StringBuilder(subDomains);
                    sb1.append(".");
                    sb1.append(sb.toString());
                    sb=sb1;
                }
             //   sb.reverse();
                String temp = sb.toString();
                if(domainCount.containsKey(temp)){
                    int tempCount = domainCount.get(temp);
                    domainCount.put(temp,count+tempCount);
                }else{
                    domainCount.put(temp,count);
                }
            }
            
        }

        for(String key : domainCount.keySet()){
            StringBuilder sb = new StringBuilder(domainCount.get(key).toString());
            sb.append(" ");
            sb.append(key);
            result.add(sb.toString());
        }
        return result;
    }
}